package com.example.demo;

public class StaticBlock1 {   

StaticBlock1() {
        System.out.println("Inside the constructor of the class.");
    }
 
    static {
        System.out.println("Inside the static block. - 1");
    }
 
    public static void foo() {
        System.out.println("Inside the method foo.");
    }
 
    static {
        System.out.println("Inside the static block. - 2");
    }
 
    static {
        System.out.println("Inside the static block. - 3");
    }
 
    public static void main(String[] args) {
 
        StaticBlock1 sbObj = new StaticBlock1();
        sbObj.foo(); // invoking the foo() method
 
        new StaticBlock1();
 
    }
}