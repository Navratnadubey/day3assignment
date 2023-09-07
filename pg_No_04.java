//The following even sized array shows on and off times of an electric vehicle on a
//particular day in 24 hour format: (850 means 8:50AM, 1330 means 1:30PM)
//int[] ev = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
//Calculate the running time of the electric vehicle. Expected output: 1 hr 50 min
package day4Assignment;
import java.util.*;
public class pg_No_04 {
	public static void main(String args[]) {
		int a[] = {850,945,1145,1155,1230,1245,1330,1340,1425,1445};
		int sum=0;
		for(int i=1;i<a.length;i=i+2) {
			sum=sum+(a[i]-a[i-1]);
			}
		int b=sum/100;
		int c=sum%100;
		System.out.println(b+" hr "+c+" min");
	}

}
