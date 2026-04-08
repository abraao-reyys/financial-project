package service;

import model.Investment;

public class StatementService {

    public void printStatement(Wallet wallet) {

        double currentBalance = wallet.getTotalBalance();
        double target = wallet.getGoal().getTargetValue();
        double progressPercentage = (currentBalance / target) * 100;

        String header = """
                ==================== Resumo da Carteira ====================
                Meta: %s
                Prazo: %s
                Valor Alvo: R$ %.2f
                Saldo Atual: R$ %.2f
                Progresso: %.2f%%
                ============================================================
                """.formatted(
                        wallet.getGoal().getDescription(),
                        wallet.getGoal().getDeadLine(),
                        target,
                        currentBalance,
                        progressPercentage
                );

        System.out.print(header);
        System.out.println("ATIVOS NA CARTEIRA:");

        if (wallet.getInvestments().isEmpty()) {
            System.out.println("=> Nenhum investimento cadastrado ainda.");
        } else {
            for (Investment inv : wallet.getInvestments()) {
                System.out.printf("=> %s: R$ %.2f%n", inv.getName(), inv.calculateCurrentBalance());
            }
        }

        System.out.println("============================================================\n");
    }
}
