import java.util.Scanner;

class Calc
{
    public static void main(String[]args)
    {
        char op;
        int ans=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter the operator");
            op=sc.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='/'||op=='*'||op=='%')
            {

                System.out.println("enter two nos");
                int num1=sc.nextInt();
                int num2=sc.nextInt();


                if(op=='+')
                {
                    ans=num1+num2;
                }
                else if(op=='-')
                {
                    ans=num1-num2;
                }
                else if(op=='*')
                {
                    ans=num1*num2;
                }
                else if(op=='/')
                {
                    ans=num1/num2;
                }
                else if(op=='%')
                {
                    ans=num1%num2;
                }
            }
            else if(op=='x')
            {
                break;
            }
            else
            {
                System.out.println("invalid operation");
            }
        }
        System.out.println(ans);
    }
} 
//pushed