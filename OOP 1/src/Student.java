public class Student{
    public static void main(String[] args) {
        Abc ob=new Abc();
        System.out.println("My name is " + ob.name);

    }
}
class Abc {
        int rollno;
        String name;
        Abc(){
            this.rollno=13;
            this.name="ap";
        }
}


