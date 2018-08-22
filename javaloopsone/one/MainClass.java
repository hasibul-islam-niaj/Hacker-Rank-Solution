package javaloops.one;

import java.util.Scanner;

interface JLO{
    public void produceResult(int n);
}

class JavaLoopsOne implements JLO{
    @Override
    public void produceResult(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}

public class MainClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        JLO jLO = new JavaLoopsOne();

        int n = scan.nextInt();

        jLO.produceResult(n);
    }
}
