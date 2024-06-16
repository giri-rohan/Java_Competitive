package array;
import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
int a[]=new int[5];
int sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
for(int i=0;i<a.length;i++) {
	a[i]=sc.nextInt();
	sum=a[i]+sum;
}
System.out.println("the sum of the array element:"+ " "+sum);
	}

}
