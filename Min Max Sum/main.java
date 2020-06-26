package com.hackerrank.solution;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Data {
    private long minSum;
    private long maxSum;

    public long getMinSum() {
        return minSum;
    }

    public void setMinSum(long minSum) {
        this.minSum = minSum;
    }

    public long getMaxSum() {
        return maxSum;
    }

    public void setMaxSum(long maxSum) {
        this.maxSum = maxSum;
    }
}

class MinMaxSum {
    private Data data;

    public Data getData() {
        return data;
    }

    private void generator (List<Long> source) {
        for (int i=0; i<source.size(); i++){
            if (i > 0)
                data.setMaxSum(data.getMaxSum()+source.get(i));
            if (i<4)
                data.setMinSum(data.getMinSum()+source.get(i));
        }
    }

    MinMaxSum() {
        data = new Data();
        Scanner scanner = new Scanner(System.in);
        List<Long> givenData = new ArrayList<Long>();

        for (int i=0; i<5; i++){
            givenData.add(scanner.nextLong());
        }
        givenData = givenData.stream().sorted().collect(Collectors.toList());
        this.generator(givenData);
    }

}

public class main {
    public static void main(String[] args){
        Data data = new MinMaxSum().getData();
        System.out.println(data.getMinSum() + " " + data.getMaxSum());
    }
}
