package test;

import java.util.Scanner;

public class ComplementaryDNA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);

		System.out.print("Input the String:");

		String str=scan.nextLine();
		
		System.out.println(makeComplement(str));

	}
	
	public static String makeComplement(String dna) {
	    //Your code
		
		  String newStr = ""; for (int i = 0; i < dna.length(); i++) { if
		  (dna.charAt(i) == 'A') { newStr = newStr + 'T'; }
		  
		  else if (dna.charAt(i) == 'T') { newStr = newStr + 'A'; }
		  
		  else if (dna.charAt(i) == 'C') { newStr = newStr + 'G'; }
		  
		  else if (dna.charAt(i) == 'G') { newStr = newStr + 'C'; } }
		 
		
		return newStr;
	  }

}
