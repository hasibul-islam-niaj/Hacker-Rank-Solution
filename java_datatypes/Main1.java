package java_datatypes;

import java.util.Scanner;

class JavaDataTypes{
    String[] dataTypes  = {"* byte", "* short", "* int", "* long"};

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

    public void feedback(int init, String data){
        System.out.println(data + " can be fitted in:");
        for (int i = init; i<4; i++){
            System.out.println(dataTypes[i]);
        }
    }

    public void setDataTypes(String data){
        if(this.isByte(data)){
            feedback(0, data);
        }
        else if (this.isShort(data)){
            feedback(1, data);
        }
        else if(this.isInt(data)){
            feedback(2, data);
        }
        else if (this.isLong(data)){
            feedback(3, data);
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

            javaDataTypes.setDataTypes(data);
        }

        System.exit(0);
    }
}
