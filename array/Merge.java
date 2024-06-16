package array;

public class Merge {
	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int b[]= {10,20,30};
		int c[]=new int[a.length+b.length];
		int l=a[2];
		int m=a[3];
		
		for(int i=0;i<a.length-2;i++) {
			
				c[i]=a[i];
		}
			
			for(int k=0;k<b.length;k++) {
				c[k+2]=b[k];
			}
			c[c.length-1]=m;
			c[c.length-2]=l;
			for(int j=0;j<c.length;j++) {
			System.out.print( c[j]+" ");
			
			}	
}
}