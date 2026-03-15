import com.access.one.Base;
import com.access.two.Derived;

public class AccessModifierDemo {
    public static void main(String[] args) {
        System.out.println("===== Exercise 9 =====\n");

        Base b = new Base();
        System.out.println("--- Base Object ---\n");
        b.showAll();

        System.out.println("\n" + "=".repeat(50));

        Derived d = new Derived();
        System.out.println("\n--- Derived Object ---\n");
        d.testAccessibility();

        System.out.println("\n" + "=".repeat(50));

        System.out.println("\n=== ACCESS TABLE ===");
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s",
                "Modifier", "Same Class", "Same Pkg", "Subclass", "Outside"));
        for (int i = 0; i < 80; i++) System.out.print("-");
        System.out.println();
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s",
                "public", "YES", "YES", "YES", "YES"));
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s",
                "protected", "YES", "YES", "YES", "NO"));
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s",
                "default", "YES", "YES", "NO", "NO"));
        System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s",
                "private", "YES", "NO", "NO", "NO"));
    }
}
