//super is used to invoke parent class constructor.
class Animal1{
    Animal1(){
        System.out.println("animal is created");
    }
}
class Dog1 extends Animal{
    Dog1(){
        super();
        System.out.println("dog is created");
    }
}
public class Super1{
    public static void main(String args[]){
        Dog1 d=new Dog1();
    }
}
