package com.hackerrank.solution;
import java.util.Scanner;

class Data {
    private int n;
    private int leftDiagonal;
    private int rightDiagonal;
    private int diagonalDifference;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getLeftDiagonal() {
        return leftDiagonal;
    }

    public void setLeftDiagonal(int leftDiagonal) {
        this.leftDiagonal = leftDiagonal;
    }

    public int getRightDiagonal() {
        return rightDiagonal;
    }

    public void setRightDiagonal(int rightDiagonal) {
        this.rightDiagonal = rightDiagonal;
    }

    public int getDiagonalDifference() {
        return diagonalDifference;
    }

    public void setDiagonalDifference(int diagonalDifference) {
        this.diagonalDifference = diagonalDifference;
    }

    Data(){
        leftDiagonal = rightDiagonal = n = 0;
    }
}

class DiagonalDifference {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    DiagonalDifference(){
        Scanner scanner = new Scanner(System.in);
        this.setData(new Data());
        int n;

        data.setN(scanner.nextInt());
        for (int i=0 ;i<data.getN(); i++){
            for (int j=0; j<data.getN(); j++){
                n = scanner.nextInt();
                if (i == j)
                    data.setLeftDiagonal(data.getLeftDiagonal()+n);
                if(j+1 == data.getN()-i)
                    data.setRightDiagonal(data.getRightDiagonal()+n);
            }
        }

        data.setDiagonalDifference(Math.abs(data.getLeftDiagonal() - data.getRightDiagonal()));
    }
}

public class main {
    public static void main(String[] args){
        DiagonalDifference diagonalDifference = new DiagonalDifference();
        Data data = diagonalDifference.getData();
        System.out.println(data.getDiagonalDifference());
    }
}
