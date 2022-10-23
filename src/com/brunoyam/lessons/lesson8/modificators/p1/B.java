package com.brunoyam.lessons.lesson8.modificators.p1;

public class B extends A{
    void test() {
        // public
        System.out.println(publicVariable);
        publicMethod();
        // private
//        System.out.println(privateVariable);
//        privateMethod();
        // default
        System.out.println(defaultVariable);
        defaultMethod();
        // protected
        System.out.println(defaultVariable);
        defaultMethod();
    }

}
