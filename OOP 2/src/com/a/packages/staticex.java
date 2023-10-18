package com.a.packages;

public class staticex {
    public static void main(String[] args) {
        staticex ob=new staticex();
        ob.greeting();
        fun();

    }
    //static fun can be called directly whereas non static fun should create a object
    static void fun(){
        System.out.println("Hello");
    }
    void greeting(){
        System.out.println("Hii");
    }
}
