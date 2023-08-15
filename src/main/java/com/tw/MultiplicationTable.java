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
        String generatedTable = "";
        for (int i=start; i<=end; i++) {
            for (int j=start; j<=i; j++) {
                generatedTable += generateSingleExpression(j,i);
                if (j != i) {
                    generatedTable += "  ";
                }
            }
            generatedTable += System.lineSeparator();
        }
        return generatedTable.trim();
    }

    public String generateLine(int start, int row) {
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
