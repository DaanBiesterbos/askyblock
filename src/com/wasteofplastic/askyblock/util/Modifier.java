package com.wasteofplastic.askyblock.util;

public class Modifier {

    private int amount = 0;
    private Character operator = null;

    public Modifier(int amount) {
        this.amount = amount;
    }

    public int applyOperator(int value) {
        if (amount == 0) {
            return value;
        }
        switch(operator) {
            case '*':
                return value * amount;
            case '+':
                return value + amount;
            case '-':
                return value - amount;
        }

        return value;
    }

    public float applyOperator(float value) {
        return applyOperator((int)value);
    }

    public boolean isValid() {
        if (!operator.equals('*') && !operator.equals('+') && !operator.equals('-')) {
           return false;
        }
        return true;
    }

    public Modifier(Character operator) {
        this.operator = operator;
    }

    public Modifier(int amount, Character operator) {
        this.amount = amount;
        this.operator = operator;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Character getOperator() {
        return operator;
    }

    public void setOperator(Character operator) {
        this.operator = operator;
    }
}
