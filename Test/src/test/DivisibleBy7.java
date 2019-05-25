package test;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleBy7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);

		System.out.print("Input the String:");

		int number=scan.nextInt();
		System.out.println(Arrays.toString(seven(number)));
	}

	
	public static long[] seven(long m) {
        // your code
		
		int count = 0;
		while (m > 99) {
			m = (m/10) - 2*(m%10);
			count++;
		}
		
		return new long[] {m,count};
    }

}
