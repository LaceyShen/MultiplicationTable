package com.tw;

import java.util.ArrayList;

public class MultiplicationTable {

    /*public static void main(String[] args) {
        MultiplicationTable multiplicationTable=new MultiplicationTable();
        System.out.println(multiplicationTable.create(2,4));
    }*/
    public String create(int start, int end) {
        if(isValid(start,end)){
            String multiplicationTable="";
            multiplicationTable=generateTable(start,end);
            return multiplicationTable;
        }else {
            return null;
        }
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start)&&isInRange(end)&&isStartNotBiggerThanEnd(start,end);
    }

    public Boolean isInRange(int number) {
        return number>=1&&number<=1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start<=end;
    }

    public String generateTable(int start, int end) {
        ArrayList<String> linelist=new ArrayList<>();
        for (int i = start; i <=end ; i++) {
            String line=generateLine(start,i);
            linelist.add(line);
        }
        return String.join(System.lineSeparator(),linelist);
    }

    public String generateLine(int start, int row) {
        ArrayList<String> expressionList=new ArrayList<>();
        for (int i = start; i <=row ; i++) {
            String expression=generateSingleExpression(i,row);
            expressionList.add(expression);
        }
        return String.join("  ",expressionList);
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        String multiplicationExpression=multiplicand+"*"+multiplier+"="+multiplicand*multiplier;
        return multiplicationExpression;
    }
}
