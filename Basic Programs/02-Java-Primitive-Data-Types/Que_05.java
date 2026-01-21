/*Suppose you have to divide 14 pens among 3 students equally. Write a program to find how
many pens each student will get if the pens must be divided equally. Also, find the remaining
non-distributed pens.
Hint =>
a. Use Modulus Operator (%) to find the reminder.
b. Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___ */
public class Que_05 {
    public static void main(String[] args) {
        int totalPens = 14;
        int numberOfStudents = 3;
        int pensPerStudent = totalPens / numberOfStudents;
        int remainingPens = totalPens % numberOfStudents;
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
    }
}
