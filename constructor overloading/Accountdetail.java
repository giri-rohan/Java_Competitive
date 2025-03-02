 //constructor overloading .. 

public class Accountdetail{
// 
    long accno;
    double balance;
    String name;
    public Accountdetail(long accno,double balance,String name){
        this.accno=accno;
        this.balance=balance;
        this.name=name;
    }
    public Accountdetail(long accno){
        this.accno=accno;
    }
    public Accountdetail(){
    

    }
    public static void main(String[] args) {
        Accountdetail ac1=new Accountdetail();
        System.out.println(ac1.accno+" "+ac1.name+" "+ac1.balance);
        Accountdetail ac2=new Accountdetail(9886723610L);
        System.out.println(ac2.accno+" "+ac2.name+" "+ac2.balance);
        Accountdetail ac3=new Accountdetail(9886723610L,43000,"spiders");
        System.out.println(ac3.accno+" "+ac3.name+" "+ac3.balance);
    }
}