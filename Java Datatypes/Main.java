package java_datatypes;

import java.util.Scanner;

class JavaDataTypes{
    public boolean isByte(String data){
        try {
            Byte isByte = Byte.parseByte(data);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public boolean isShort(String data){
        try {
            Short isShort = Short.parseShort(data);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public boolean isInt(String data){
        try {
            int isInt = Integer.parseInt(data);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public boolean isLong(String data){
        try {
            long isLong = Long.parseLong(data);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }

    public void tellDataType(String data){
        if(this.isByte(data)){
            System.out.println(data + " can be fitted in:");
            System.out.println("* byte");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }
        else if (this.isShort(data)){
            System.out.println(data + " can be fitted in:");
            System.out.println("* short");
            System.out.println("* int");
            System.out.println("* long");
        }
        else if(this.isInt(data)){
            System.out.println(data + " can be fitted in:");
            System.out.println("* int");
            System.out.println("* long");
        }
        else if (this.isLong(data)){
            System.out.println(data + " can be fitted in:");
            System.out.println("* long");
        }
        else {
            System.out.println(data + " can't be fitted anywhere.");
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        JavaDataTypes javaDataTypes = new JavaDataTypes();

        int t;
        String data;

        t = scan.nextInt();
        for (int testCase=1; testCase<=t; testCase++) {
            data = scan.next();

            javaDataTypes.tellDataType(data);
        }

        System.exit(0);
    }
}
