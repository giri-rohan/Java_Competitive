//overriding
class Animal{
    void eat(){
        System.out.println("eating...");
        
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("eating bread");
    }
    void bark(){
        System.out.println("barking");
    }
    void work(){
        super.eat();
        bark();
    }
}
