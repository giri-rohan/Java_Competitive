
//encapsulation

public class Student{
private int age;
private double perc;
public int getage(){
    return age;
}
public void setage(int age){
    this.age=age;
}
public double getperc(){
    return perc;
}
public void setperc(double perc){
this.perc=perc;
}
public static void main(String[] args) {
    Student s=new Student();
    s.setage(12);
    System.out.println(s.getage());
    s.setperc(70.64);
    System.out.println(s.getperc());
}
}