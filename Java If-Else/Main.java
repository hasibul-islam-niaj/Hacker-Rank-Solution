package JavaIfElse;

import java.util.Scanner;

class IfElse{
	Scanner scan = new Scanner (System.in);
	
	short readInput(){
		return scan.nextShort();
	}
	
	String makeDecision(Short n) {
		if (n%2!=0) {
			return "Weird";
		}
		else {
			if (n>=2 && n<=5)
				return "Not Weird";
			else if (n>=6 && n<=20)
				return "Weird";
			else
				return "Not Weird";
		}
	}
}

public class Main {
	public static void main(String[] args) {
		IfElse ie = new IfElse();
		
		System.out.println(ie.makeDecision(ie.readInput()));
	}
}
