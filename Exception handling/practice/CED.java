import java.io.*;
public class CED {
    public static void main(String[] a) {
        try {
            BufferedReader b = new BufferedReader(new FileReader("data.txt"));
            String l;
            while ((l = b.readLine()) != null) {
                System.out.println(l);
            }
            b.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}