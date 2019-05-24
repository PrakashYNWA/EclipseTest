package test;

import java.util.Scanner;

public class PrinterErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);

		System.out.print("Input the String:");

		String str=scan.nextLine();
		
		System.out.println(printerError(str));

	}
	
	public static String printerError(String s) {
		
		int count = 0;
		
		for (int i = 0; i < s.length(); i++ ) {
			if (s.charAt(i) > 109) {
				count++;
			}
		}

		
		return count + "/" + s.length();
        
    }

}
