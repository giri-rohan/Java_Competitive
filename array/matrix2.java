//package array;
//import java.util.Scanner;
//public class matrix2 {
//	int m,n,a[][];
//public static void main(String[] args) {
//	System.out.println("how many row and columns?");
//Scanner sc =new Scanner(System.in);
//int m=sc.nextInt();
//matrix2 m1=new matrix2();
//int n=sc.nextInt();
//for(int i=0;i<m;i++) {
//	for(int j=0;j<n;j++) {
//	System.out.println("enter The elements of array");
//	
//	m1.a[i][j]=sc.nextInt();
//	
//	}
//}
//
//for(int i=0;i<m;i++) {
//	for(int j=0;j<n;j++) {
//	System.out.println("The  array is");
//	System.out.println(m1.a[i][j]);
//	
//	}
//}
//}
//}



package array;
import java.util.Scanner;
public class matrix2 {
	int m,n,a[][];
public static void main(String[] args) {
System.out.println("how many row and columns?");
Scanner sc =new Scanner(System.in);
int m=sc.nextInt();
matrix2 m1=new matrix2();
int n=sc.nextInt();
create_matrix =m1.create_matrix(m,n) ;



for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
	System.out.println("enter The elements of array");
	
	m1.a[i][j]=sc.nextInt();
	
	}
}

for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
	System.out.println("The  array is");
	System.out.println(m1.a[i][j]);
	
	}
}
}
private Object create_matrix(int m2, int n2) {
	
	
	return null;
}
}















