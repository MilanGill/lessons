package com.brunoyam.lessons.lesson8.modificators.p1;

public class C {
    void test() {
        A a = new A();
        // public
        System.out.println(a.publicVariable);
        a.publicMethod();
        // private
//        System.out.println(a.privateVariable);
//        a.privateMethod();
        // default
        System.out.println(a.defaultVariable);
        a.defaultMethod();
        // protected
        System.out.println(a.defaultVariable);
        a.defaultMethod();
    }
}
