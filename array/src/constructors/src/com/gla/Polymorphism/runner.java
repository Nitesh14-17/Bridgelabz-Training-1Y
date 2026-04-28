package com.gla.Polymorphism;

public class runner {
    public static void main(String[] args) {
        Calci c1 = new Calci();

        double sum1 = c1.add(11.22, 22.2);
        {
            System.out.println("Sum of two integer Value :-"+sum1);
        }
        int Sum2 =c1.add(15,65);
        {
            System.out.println("Sum of teo double :-"+Sum2);
        }

    }
}