package SolveMeFirst;

import java.util.Scanner;

class SolveMeFirst{
	Scanner scan = new Scanner (System.in);
	
	private int readA() {
		return scan.nextInt();
	}
	
	private int readB() {
		return scan.nextInt();
	}
	
	private int addition(int a, int b) {
		return a+b;
	}
	
	SolveMeFirst(){
		/**
		  * Remarks: 
		  * this is constructor. this do nothing.
		  */
	}
	
	public String toString() {
		return Integer.toString(addition(readA(), readB()));
	}
}

public class Main {
	public static void main(String[] args) {		
		System.out.println(new SolveMeFirst());
	}
}
