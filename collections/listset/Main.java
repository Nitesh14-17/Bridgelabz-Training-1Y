import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(ListTasks.reverseArrayList(new ArrayList<>(l1)));
        LinkedList<Integer> l2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(ListTasks.reverseLinkedList(new LinkedList<>(l2)));
        List<String> l3 = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(ListTasks.freq(l3));
        List<Integer> l4 = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println(ListTasks.rotate(l4, 2));
        List<Integer> l5 = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println(ListTasks.removeDup(l5));
        LinkedList<String> l6 = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(ListTasks.nthFromEnd(l6, 2));
        //set
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(3, 2, 1));
        System.out.println(SetTasks.eq(s1, s2));
        Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> s4 = new HashSet<>(Arrays.asList(3, 4, 5));
        System.out.println(SetTasks.uni(s3, s4));
        System.out.println(SetTasks.inter(s3, s4));
        System.out.println(SetTasks.symDiff(s3, s4));
        Set<Integer> s5 = new HashSet<>(Arrays.asList(5, 3, 9, 1));
        System.out.println(SetTasks.toSortedList(s5));
        Set<Integer> s6 = new HashSet<>(Arrays.asList(2, 3));
        Set<Integer> s7 = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(SetTasks.isSub(s6, s7));
        //QUEUE 
        Queue<Integer> q1 = new LinkedList<>(Arrays.asList(10, 20, 30));
        System.out.println(QueueTasks.rev(new LinkedList<>(q1)));
        System.out.println(QueueTasks.bin(5));
        List<QueueTasks.Pat> p = Arrays.asList(new QueueTasks.Pat("John", 3), new QueueTasks.Pat("Alice", 5), new QueueTasks.Pat("Bob", 2));
        System.out.println(QueueTasks.triage(p));
        QueueTasks.MyStack st = new QueueTasks.MyStack();
        st.push(1); st.push(2); st.push(3);
        System.out.println(st.pop());
        QueueTasks.CircBuf buf = new QueueTasks.CircBuf(3);
        buf.add(1); buf.add(2); buf.add(3); buf.add(4);
        System.out.println(buf.get());
    }
}
