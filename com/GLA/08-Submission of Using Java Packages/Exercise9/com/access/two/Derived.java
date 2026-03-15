package com.access.two;

import com.access.one.Base;

/**
 * Derived class in a different package
 * Demonstrates access modifier rules in inheritance across packages
 */
public class Derived extends Base {

    public void testAccessibility() {
        System.out.println("===== Testing Method Accessibility in Derived Class (Different Package) =====\n");

        // 1. Public - ACCESSIBLE
        System.out.println("1. public Method: ");
        try {
            pubMethod();
            System.out.println("   OK\n");
        } catch (Exception e) {
            System.out.println("   NOT OK\n");
        }

        // 2. Protected - ACCESSIBLE (in subclass)
        System.out.println("2. protected Method: ");
        try {
            protMethod();
            System.out.println("   OK (in subclass from different package)\n");
        } catch (Exception e) {
            System.out.println("   NOT OK\n");
        }

        // 3. Default - NOT ACCESSIBLE
        System.out.println("3. default Method: ");
        System.out.println("   NOT OK (only in same package)");
        System.out.println("   Reason: Default access is limited to the same package\n");

        // 4. Private - NOT ACCESSIBLE
        System.out.println("4. private Method: ");
        System.out.println("   NOT OK (only in the same class)");
        System.out.println("   Reason: Private access is limited to the same class\n");
    }
}
