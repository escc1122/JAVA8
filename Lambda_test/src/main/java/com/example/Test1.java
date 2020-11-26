package com.example;

public class Test1 {

    @FunctionalInterface
    interface A {
        void a();
    }

    @FunctionalInterface
    interface B {
        void b();
    }

    class UseAB {
        void use(A a) {
            System.out.println("UseAB A");
            a.a();
        }

        void use(B b) {
            System.out.println("UseAB B");
            b.b();
        }
    }

    public void targetType() {
        UseAB useAB = new UseAB();
        A a = () -> System.out.println("Use");
        useAB.use(a);
    }

    public static void main(String[] args){
        new Test1().targetType();
    }


}