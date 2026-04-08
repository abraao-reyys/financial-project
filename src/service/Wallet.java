package service;

import model.FinancialGoal;
import model.Investment;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private FinancialGoal goal;
    private List<Investment> investments;

    public Wallet(FinancialGoal goal) {
        this.goal = goal;
        this.investments = new ArrayList<>();
    }

    public void addInvestment(Investment investment) {
        this.investments.add(investment);
    }

    public double getTotalBalance() {
        double total = 0.0;

        for (Investment inv : investments) {
            total += inv.calculateCurrentBalance();
        }

        return total;
    }

    public Investment findInvestmentByName(String name) {

        for (Investment inv : investments) {
            if (inv.getName().equalsIgnoreCase(name)) {
                return inv;
            }
        }

        return null;
    }

    public FinancialGoal getGoal() {
        return goal;
    }

    public List<Investment> getInvestments() {
        return investments;
    }
}
