package com.brunoyam.lessons.lesson8.modificators.p1;
// TODO Модификаторы Доступа (public,private,protected,default)
// public - доступны внутри класса и во всем проекте
// private - только внутри класса
// protected - Внутри пакета и у наследников даже в других пакетах
// default - только внутри пакета
public class A {
    public int publicVariable;
    private int privateVariable;
    int defaultVariable;
    protected int protectedVariable;

    public void publicMethod() {

    }
    private void privateMethod() {

    }
    void defaultMethod() {

    }
    protected void protectedMethod() {

    }

    void test() {
        // public
        System.out.println(publicVariable);
        publicMethod();
        // private
        System.out.println(privateVariable);
        privateMethod();
        // default
        System.out.println(defaultVariable);
        defaultMethod();
        // protected
        System.out.println(defaultVariable);
        defaultMethod();
    }
}
