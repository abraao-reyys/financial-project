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
    }
}