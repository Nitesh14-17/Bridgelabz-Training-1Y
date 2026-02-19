public class PalindromeChecker {
    String text;
    
    public PalindromeChecker(String text) {
        this.text = text;
    }
    
    public boolean isPalindrome() {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = new StringBuilder(clean).reverse().toString();
        return clean.equals(rev);
    }
    
    public void display() {
        System.out.println("Text: " + text);
        if (isPalindrome()) {
            System.out.println("Result: It is a palindrome");
        } else {
            System.out.println("Result: It is not a palindrome");
        }
    }
    
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("A man a plan a canal Panama");
        p1.display();
        
        System.out.println();
        
        PalindromeChecker p2 = new PalindromeChecker("hello");
        p2.display();
        
        System.out.println();
        
        PalindromeChecker p3 = new PalindromeChecker("racecar");
        p3.display();
    }
}
