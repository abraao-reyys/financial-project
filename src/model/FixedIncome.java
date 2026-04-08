package model;

public class FixedIncome extends Investment {

    private double interestRate;
    private int investedMonths;

    public FixedIncome(String name, double investedAmount, double interestRate, int investedMonths) {
        super(name, investedAmount);
        this.interestRate = interestRate;
        this.investedMonths = investedMonths;
    }

    @Override
    public double calculateCurrentBalance() {
        return getInvestedAmount() * Math.pow(1 + interestRate, investedMonths);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getInvestedMonths() {
        return investedMonths;
    }
}
