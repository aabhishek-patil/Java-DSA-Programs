//compile time polymorphism (static polymorphism)
public class Polymorphism {
    int sum(int a , int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Polymorphism ob=new Polymorphism();
        System.out.println(ob.sum(1,2));
        System.out.println(ob.sum(3,4,5));
    }
}
