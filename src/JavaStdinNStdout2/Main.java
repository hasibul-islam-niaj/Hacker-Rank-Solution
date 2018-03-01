package JavaStdinNStdout2;

import java.util.Scanner;

class StdinNStdout{
	Scanner scan = new Scanner (System.in);
	
	int readIntegerValue() {
		return scan.nextInt();
	}
	
	double readDoubleValue() {
		return scan.nextDouble();
	}
	
	String readString() {
		scan.nextLine();
		return scan.nextLine();
	}
	
	StdinNStdout(){
		int c = readIntegerValue();
		double b = readDoubleValue();
		String a = readString();
		
		System.out.println("String: "+a);
		System.out.println("Double: "+b);
		System.out.println("Int: "+c);
	}
	
	public String toString() {
		return "";
	}
}

public class Main {
	public static void main(String[] args) {
		System.out.println(new StdinNStdout());
	}
}
