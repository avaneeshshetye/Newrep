package Array;

import java.util.Scanner;

public class SearchingAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int n, find, flag = 0, i = 0, position = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		 n = scan.nextInt();
		int a[]= new int[n];
		
		System.out.print("Enter the elements you wanna add: ");
		System.out.println();
		
		
		for( i=0; i<a.length; i++) {
			
			int x = scan.nextInt();
			a[i]=x;
			}
		
		for(i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("What element do you wanna search for?");
		 find = scan.nextInt();
		
		
		
		for( i=0; i<a.length; i++)
		{
			if(a[i] == find) {
				 flag = 0;
				 position = i+1;
				break;
			}
			
			else
			
			{
				 flag=1;
			}
			
			}
		
		
		if(flag == 0) {
			
			System.out.println("Element " + find +  " is at index " + i + " and position " + position);
		}
		else
		{
			System.out.println("No such element");
		}
		
	}
}