//constructor chaining
class Car extends Vehichle{
    public Car(){
        this("black");
        System.out.println("Red");
    }
    public Car(String clr){
        this(125000);
    System.out.println("color"+" "+ clr);
    }
    public Car(int price){
        super();
        System.out.println("price"+" "+price);
    }
    public static void main(String[] args) {
        Car c=new Car();
    }

}