//Reverse the array
package day4Assignment;
import java.util.*;
public class Pg_no_01 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=input.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the value of the array");
		for(int i=0;i<a.length;i++) {
			a[i]=input.nextInt();
		}
		System.out.print("The reverse array is : ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
