package day4Assignment;
import java.util.*;
public class pg_no_06 {
	public static void main(String args[]) {
		int a[] = {12, 18, 20, 38, 53, 93, 77, 61, 59, 56};
		int index=0;
		for(int i=1;i<a.length;i++) {
			if(a[i-1]<a[i]) {
				index=i+1;
			}
		}
		System.out.println("The decline in profit is began : "+(2001+index));
	}

}
