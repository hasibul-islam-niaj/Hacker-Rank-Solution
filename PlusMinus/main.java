package com.hackerrank.solution;
import java.util.Scanner;

class Data {
    private double countedPositive;
    private double countedNegative;
    private double countedZero;
    private int sizeOfArray;

    public double getCountedPositive() {
        return countedPositive;
    }

    public void setCountedPositive(double countedPositive) {
        this.countedPositive += countedPositive;
    }

    public double getCountedNegative() {
        return countedNegative;
    }

    public void setCountedNegative(double countedNegative) {
        this.countedNegative += countedNegative;
    }

    public double getCountedZero() {
        return countedZero;
    }

    public void setCountedZero(double countedZero) {
        this.countedZero += countedZero;
    }

    public int getSizeOfArray() {
        return sizeOfArray;
    }

    public void setSizeOfArray(int sizeOfArray) {
        this.sizeOfArray = sizeOfArray;
    }
}

class PlusMinus {
    private Data data;
    double getFractions (double data){
        return data/this.data.getSizeOfArray();
    }

    PlusMinus() {
        float temp;
        data = new Data();
        Scanner scanner = new Scanner(System.in);
        data.setSizeOfArray(scanner.nextInt());

        for (int i=0; i<data.getSizeOfArray(); i++){
            temp = scanner.nextFloat();
            if (temp > 0)
                data.setCountedPositive(1);
            else if (temp < 0)
                data.setCountedNegative(1);
            else
                data.setCountedZero(1);
        }

        System.out.printf("%.6f\n", this.getFractions(data.getCountedPositive()));
        System.out.printf("%.6f\n", this.getFractions(data.getCountedNegative()));
        System.out.printf("%.6f\n", this.getFractions(data.getCountedZero()));
    }
}

public class main {
    public static void main(String[] args){
        new PlusMinus();
    }
}
