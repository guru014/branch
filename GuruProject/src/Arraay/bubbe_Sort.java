package Arraay;

import java.util.Scanner;

public class bubbe_Sort {

	public static void main(String[] args) 
	{
		
		/*
		 * Scanner s1= new Scanner(System.in); int[] arr= new int[10];
		 * 
		 * 
		 * for(int i=0; i<11;i++) { arr[i]=s1.nextInt(); }
		 * 
		 * for(int x:arr) { System.out.println(x); }
		 */
		 
		int[]arr= {2,5,3,7};
		
		for(int i=0; i<=arr.length-1;i++)
		{
			for(int j=0; j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
				}
				
				
			}
		}
		
		for(int x:arr)
		{
			System.out.print(x);
		}

	}

}
 