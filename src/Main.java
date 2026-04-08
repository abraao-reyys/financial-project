import model.*;
import service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao Gerenciador de Metas Financeiras!");
        System.out.println("Primeiro, vamos definir o seu grande objetivo.");

        System.out.print("Descreva brevemente a sua meta (ex.: Comprar Moto): ");
        String description = input.nextLine();

        System.out.print("Informe o valor alvo (R$): ");
        double targetValue = input.nextDouble();

        System.out.print("Informe o prazo da meta (ex: 02/2028): ");
        String deadline = input.nextLine();

        FinancialGoal goal = new FinancialGoal(description, targetValue, deadline);
        Wallet wallet = new Wallet(goal);
        StatementService statementService = new StatementService();

        boolean running = true;

        while (running) {
            System.out.println("\n=== Menu Principal ===");
            System.out.println("""
                    1. Adicionar Renda Fixa (CDB, Tesouro Direto)
                    2. Adicionar Renda Variável (Ações, FIIs)
                    3. Ver Extrato da Carteira
                    4. Buscar Investimento por Nome
                    0. Sair da Aplicação
                    """);

            System.out.print("Escolha uma opção: ");
            String option = input.nextLine();

            switch (option) {
                case "1":
                    try {
                        System.out.print("Informe o nome do ativo: ");
                        String name = input.nextLine();

                        System.out.print("Informe o valor aplicado (R$): ");
                        double amount = input.nextDouble();

                        System.out.print("Informe a taxa de juros ao mês (% em decimal; ex.: 0.01): ");
                        double rate = input.nextDouble();

                        System.out.print("Tempo investido (meses): ");
                        int months = input.nextInt();

                        FixedIncome fixedIncome = new FixedIncome(name, amount, rate, months);
                        wallet.addInvestment(fixedIncome);

                        System.out.println("Renda Fixa adicionada com sucesso!");
                    } catch (NumberFormatException e) {
                        System.out.println("Erro: Por favor, digite apenas números válidos para os valores.");
                    }
                    break;

                // case "2":
            }
        }
    }
}