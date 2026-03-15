package com.access.one;

public class Base {
    public void pubMethod() {
        System.out.println("PUBLIC - Accessible everywhere");
    }

    protected void protMethod() {
        System.out.println("PROTECTED - Accessible in subclasses");
    }

    void defMethod() {
        System.out.println("DEFAULT - Accessible only in same package");
    }

    private void privMethod() {
        System.out.println("PRIVATE - Accessible only in same class");
    }

    public void showAll() {
        System.out.println("=== Base Methods ===");
        pubMethod();
        protMethod();
        defMethod();
        privMethod();
    }
}
