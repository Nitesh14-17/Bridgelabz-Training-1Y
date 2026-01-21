/*2. Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average
percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ */
public class Que_02 {
    public static void main(String[] args) {
        int mathsMark = 94;
        int physicsMark = 95;
        int chemistryMark = 96;
        int totalMarks = mathsMark + physicsMark + chemistryMark;
        double averageMark = totalMarks / 3.0;
        System.out.println("Sam's average mark in PCM is " + averageMark);
    }
}

