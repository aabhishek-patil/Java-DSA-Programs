package Encapsulation;

public class student {
    public void setName(String vijay) {
    }

    public boolean getName() {
        return false;
    }

    public class Student{
        //private data member
        private String name;
        //getter method for name
        public String getName(){
            return name;
        }
        //setter method for name
        public void setName(String name){
            this.name=name;
        }
    }
}
