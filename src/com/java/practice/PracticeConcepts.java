package com.java.practice;

public class PracticeConcepts {

    public static void main(String[] args) throws Exception {
        add("hi");
        System.out.println("------------");
        add("hello");
        System.out.println("------------");
        add("fdfd");
    }

    /*PracticeConcepts() throws Exception {
        throw new Exception();
    }*/

    static void add(String i) {
        switch (i) {
            case "hi":
                System.out.println("hii");
                break;
            case "hello":
                System.out.println("hello");
            default:
                System.out.println("default");
        }
    }
}

interface B {

    class A {
        public void add() {
            System.out.println("i i c");
        }
    }

}
