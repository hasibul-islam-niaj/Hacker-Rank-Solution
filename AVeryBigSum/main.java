package com.hackerrank.solution;
import java.util.Scanner;

class VeryBigSum{
    private int n;
    private long sum;

    public void setN(int n){
        this.n = n;
    }

    public int getN(){
        return n;
    }

    public void setSum(long sum){
        this.sum += sum;
    }

    public long getSum(){
        return sum;
    }
}

class DataManager{
    private Scanner sc;
    private VeryBigSum veryBigSum;

    public VeryBigSum getData(){
        return veryBigSum;
    }

    public void generateData(){
        for (int i = 0; i<veryBigSum.getN(); i++){
            veryBigSum.setSum(sc.nextLong());
        }
    }

    DataManager(){
        this.sc = new Scanner(System.in);
        veryBigSum = new VeryBigSum();

        veryBigSum.setN(sc.nextInt());
    }
}

public class main {
    public static void main(String[] args){
        DataManager dataManager = new DataManager();
        dataManager.generateData();
        VeryBigSum veryBigSum = dataManager.getData();
        System.out.println(veryBigSum.getSum());
    }
}
