package array;
import java.util.Scanner;
public class Pirmeno {
public static void main(String[] args) {
	int a[]=new int[5];
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the elements in array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		boolean isprime=true;
		for(int j=2;j<a[i];j++) {
			if(a[i]%j==0) {
				isprime=false;
			}
		}
		if(isprime) {
			System.out.println(a[i]+"  "+"are the prime no");
		}
	}
}
}
