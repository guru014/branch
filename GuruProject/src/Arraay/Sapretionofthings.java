package Arraay;

import java.util.Scanner;

public class Sapretionofthings {

	public static void main(String[] args) {
		
		  System.out.println("give numbers as input"); 
//		/*/ * Scanner sc= new
//		 * Scanner(System.in);
//		 * 
//		 * String s1 = sc.next(); char[] arr = s1.toCharArray();
//		 */*/
		     Scanner sc= new Scanner(System.in);
		   
		   
		
		     int[] arr = { sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt() };

		int Esum = 0;
		int Ecount = 0;
		int Osum = 0;
		int Ocount=0;
		int AEvn = 0;
		 int Aodd = 0;

		System.out.println("size 0f array=" + arr.length);

		for (int x : arr) {

			if (x % 2 == 0) {
				Ecount++;
				Esum = Esum + x;
				 AEvn = Esum/Ecount;
				
				
			} else {
				Ocount++;
				Osum = Osum + x;
				 Aodd = Osum/Ocount;
				
			}

		}
		System.out.println("avrg of even arry" + AEvn);
		System.out.println("avrg of odd arry" +  Aodd);

	}

}
