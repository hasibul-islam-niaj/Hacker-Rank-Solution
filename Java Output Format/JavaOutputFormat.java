package javaOutputFormat;
import java.util.Scanner;

class Formatter extends JavaOutputFormat{
	Scanner sc = new Scanner(System.in);
	int[] data = new int [3];
	String[] strData = new String[3];
	
	public int[] integerReader(int i) {
		data[i] = sc.nextInt();
		return data;
	}
	
	public String[] stringReader(int i) {
		strData[i] = sc.next();
		return strData;
	}
	
	public int[] takeInt() {
		return data;
	}
	
	public String[] takeString() {
		return strData;
	}
	
	public int Reader(int i) {
		if (i==3) {
			return 0;
		}
		else {
			stringReader(i);
			integerReader(i);
			i++;
			return Reader(i);
		}
	}
	
	public int outResult(String[] a, int [] b,int i) {
		if (i==3) {
			return 0;
		}
		else {
			formattedPrint(a[i], b[i]);
			i++;
			return outResult(a, b, i);
		}
	}
	
	public void formattedPrint(String str, int value) {
		System.out.printf("%-15s%03d\n", str, value);
	}
	
	public void functionPrint(Object data) {
		System.out.println(data);
	}
	
	public void printArray(int[] value) {
		for (int i = 0; i < 3; i++) {
			System.out.println(value[i]);
		}
	}
}

public class JavaOutputFormat {
	public static void main(String[] args) {
		JavaOutputFormat jof = new JavaOutputFormat();
		Formatter fm = new Formatter();
		
		String[] str = new String[3];
		int[] value = new int[3];
		
		fm.Reader(0);
		
		str = fm.takeString();
		value = fm.takeInt();
		fm.functionPrint("================================");
		fm.outResult(str, value, 0);
		fm.functionPrint("================================");
	}
}
