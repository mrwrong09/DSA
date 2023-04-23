package org.example;

/***
 * Question: can we override main method ?
 * Answer: NO, because main method is a static method and overriding relies on dynamic binding at runtime
 * whereas static methods are bonded at compile time with static binding, so we can not override the main
 * method
 */
public class CanWeOverrideMainMethod {

    public static void main(String[] args) {
        System.out.println("main method in main class");
    }
}

class ChildClass extends CanWeOverrideMainMethod{


    public static void main(String[] args) {

    }
}
