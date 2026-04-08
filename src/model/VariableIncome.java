package model;

public class VariableIncome extends Investment {

    private int shares;
    private double currentSharePrice;

    public VariableIncome(String name, double investedAmount, int shares, double currentSharePrice) {
        super(name, investedAmount);
        this.shares = shares;
        this.currentSharePrice = currentSharePrice;
    }

    @Override
    public double calculateCurrentBalance() {
        return shares * currentSharePrice;
    }

    public int getShares() {
        return shares;
    }

    public double getCurrentSharePrice() {
        return currentSharePrice;
    }
}
