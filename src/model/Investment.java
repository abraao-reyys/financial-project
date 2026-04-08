package model;

public abstract class Investment {

    private String name;
    private double investedAmount;

    public Investment(String name, double investedAmount) {
        this.name = name;
        this.investedAmount = investedAmount;
    }

    public abstract double calculateCurrentBalance();

    public String getName() {
        return name;
    }

    public double getInvestedAmount() {
        return investedAmount;
    }
}
