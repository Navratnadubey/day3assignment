package day4Assignment;
import java.util.*;
public class pg_no_02 {
	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int a[]= {1,1,1,0,1,1,1,1,1,1,0,0,1,1,1,0,1,1,1,0,1};
		double count=0;
		double present;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) {
				count++;
			}
		}
		double ab=a.length-count;
		present=((a.length-ab)/a.length)*100;
		System.out.print("The percentage of the Student present in the class is : ");
		System.out.println(present);
		System.out.print("The percentage of the Student Absent in the class is : ");
		System.out.print(100-present);
	}

}
