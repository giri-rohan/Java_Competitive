import java.util.Scanner;

class Fibo{
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n ");
         n=sc.nextInt();
         int g[]=new int[n];
        int count=2;
        g[0]=0;
        g[1]=1;
        

        while(count<n){
        int temp=b;
         b=b+a;
         a=temp;
          g[count]=b;
        count++;
       
        }
        System.out.println("the fibonacci series is"+" "+ b);
                System.out.print("The Fibonacci series is: ");
        for (int i = 0; i <n; i++) {
            System.out.print(g[i] + " ");
 
    }
}
}