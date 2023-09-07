package day4Assignment;
import java.util.*;
public class pg_no_03 {
	public static void main(String args[]) {
		String a[]= {"January","February","March","April","May","June","July","August","September","October","November","December"};
		int b[]= {125000,93000,80000,75000,84000,110000,105000,120000,90000,115000,123000,150000};
		int totalsalevalue=0;
		int q1=0;
		int q2=0;
		int q3=0;
		for(int i=0;i<b.length;i++) {
			System.out.println(a[i]+" : "+b[i]);
			totalsalevalue=totalsalevalue+b[i];
			if(i<4) {
				q1=q1+b[i];
				if(i==3) {
					System.out.println("The first quarter sale value is : "+q1);
				}
			}else if(i>=4&&i<=7) {
				q2=q2+b[i];
				if(i==7) {
					System.out.println("The Second quarter sale value is : "+q2);
				}
			}else {
				q3=q3+b[i];
			}
		}
		System.out.println("The Third quarter sale value is : "+q3);
		System.out.println("The totalsales value is : "+totalsalevalue);
		
		
	}

}
