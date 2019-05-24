package test;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);

		System.out.print("Input the String:");

		String str=scan.nextLine();
		ReverseString a = new ReverseString();
		System.out.println("The Reveresed String is: " + a.reverse(str));

	}
	
	public String reverse(String str) {
		
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0;i--) {
			
			rev = rev + str.charAt(i);
			
		}

		return rev;
	}

}
