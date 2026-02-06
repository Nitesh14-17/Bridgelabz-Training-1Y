// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class GenerateSubstring {
    public static void main(String[] args) {
        String str = "Java compiler";
        String s = new String("Hello");
        String s1 = new String("Java compiler");
        //System.out.print(s + " "+str);
        //System.out.println(str.charAt(5));
        //System.out.println(str.equals(s1));
        //System.out.println(str.toUpperCase());
        //System.out.println(str.toLowerCase());
        //System.out.println(str.substring(0,8));
        int c =str.length();
        for(int i=0;i<=c;i++)
        {   for(int j=i+1;j<=c;j++){
            System.out.println(str.substring(i,j));
        }
        }

    }
}