package array;
import java.util.Scanner;
public class Evenno {
public static void main(String[] args) {
	int a[]=new int[5];
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the elemnts in array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		
		if(a[i]%2==0) {
			System.out.println("The even no are"+a[i]);
		}
		else {
			System.out.println("the odd no are"+a[i]);
		}
	}
}
}
