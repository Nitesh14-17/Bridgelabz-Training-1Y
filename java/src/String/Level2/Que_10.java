package String.Level2;
import java.util.Scanner;
import java.util.Random;
public class Que_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        int[][] scores = generateRandomScores(n);

        System.out.println("\nRoll  Physics  Chemistry  Maths  Total  Average  Percent  Grade");


        for (int i = 0; i < n; i++) {
            int p = scores[i][0];
            int c = scores[i][1];
            int m = scores[i][2];
            int total = p + c + m;
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100.0;
            String grade = gradeFromPercent(percent);

            System.out.printf("%-5d %-8d %-10d %-6d %-6d %-8.2f %-7.2f %s\n",
                    i + 1, p, c, m, total, avg, percent, grade);
        }

        scanner.close();
    }

    public static int[][] generateRandomScores(int n) {
        Random r = new Random();
        int[][] s = new int[n][3];
        for (int i = 0; i < n; i++) {
            s[i][0] = r.nextInt(101);
            s[i][1] = r.nextInt(101);
            s[i][2] = r.nextInt(101);
        }
        return s;
    }

    public static String gradeFromPercent(double p) {
        if (p >= 80) return "A";
        if (p >= 70) return "B";
        if (p >= 60) return "C";
        if (p >= 50) return "D";
        if (p >= 40) return "E";
        return "R";
    }
}

