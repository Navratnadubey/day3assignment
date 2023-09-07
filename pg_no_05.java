//Write a program to input an array from the user and find the index of the smallest element
//in the array.
package day4Assignment;
import java.util.*;
public class pg_no_05 {
         public static void main(String args[]) {
        	 Scanner input=new Scanner(System.in);
        	 System.out.println("Enter the size of the Array : ");
        	 int n=input.nextInt();
        	 int a[]=new int[n];
        	 System.out.println("Enter the values of the array");
        	 for(int i=0;i<a.length;i++) {
        		 a[i]=input.nextInt();
        	 }
        	 int min=1;
    	     for(int i=0;i<a.length;i++) {
    	    	 if(a[i]<a[min]) {
    	    		 min=i;
    	    	 }
    	     }
        	 System.out.println("The index of the smallest element of the array : "+min);
         }
}
