package com.brunoyam.lessons.lesson8.modificators.p2;

import com.brunoyam.lessons.lesson8.modificators.p1.A;

public class D {
    void test() {
        A a = new A();
        // public
        System.out.println(a.publicVariable);
        a.publicMethod();
        // private
//        System.out.println(a.privateVariable);
//        a.privateMethod();
        // default
//        System.out.println(a.defaultVariable);
//        a.defaultVariable();
        // protected
          System.out.println(a.publicVariable);
          a.publicMethod();
    }
}
