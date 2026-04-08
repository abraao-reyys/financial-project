package model;

public class FinancialGoal {

    private String description;
    private double targetValue;
    private String deadLine;

    public FinancialGoal(String description, double targetValue, String deadLine) {
        this.description = description;
        this.targetValue = targetValue;
        this.deadLine = deadLine;
    }

    public String getDescription() {
        return description;
    }

    public double getTargetValue() {
        return targetValue;
    }

    public String getDeadLine() {
        return deadLine;
    }
}
