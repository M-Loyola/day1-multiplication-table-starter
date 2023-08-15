package com.tw;

public class MultiplicationTable {
    public String buildMultiplicationTable(int start, int end) {
        return null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number > 0 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start < end;
    }

    public String generateTable(int start, int end) {
        return null;
    }

    public String generateLine(int start, int row) { //2,5
        String generatedLine = "";
        for (int i=start; i<=row; i++) {
            generatedLine += generateSingleExpression(i,row) + "  ";
        }
        return generatedLine.trim();
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand*multiplier;
    }
}
