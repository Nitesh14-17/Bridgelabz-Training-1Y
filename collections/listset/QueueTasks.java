import java.util.*;

public class QueueTasks {
    public static Queue<Integer> rev(Queue<Integer> q) {
        if (q.isEmpty()) return q;
        int x = q.remove();
        rev(q);
        q.add(x);
        return q;
    }

    public static List<String> bin(int n) {
        List<String> r = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        for (int i = 0; i < n; i++) {
            String s = q.remove();
            r.add(s);
            q.add(s + "0");
            q.add(s + "1");
        }
        return r;
    }

    static class Pat {
        String n;
        int sev;
        Pat(String n, int sev) { this.n = n; this.sev = sev; }
    }

    public static List<String> triage(List<Pat> p) {
        PriorityQueue<Pat> q = new PriorityQueue<>((a, b) -> b.sev - a.sev);
        q.addAll(p);
        List<String> r = new ArrayList<>();
        while (!q.isEmpty()) r.add(q.remove().n);
        return r;
    }

    static class MyStack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        void push(int x) { q2.add(x); while (!q1.isEmpty()) q2.add(q1.remove()); Queue<Integer> t = q1; q1 = q2; q2 = t; }
        int pop() { return q1.remove(); }
        int top() { return q1.peek(); }
    }

    static class CircBuf {
        int[] a; int s, f = 0, r = 0, c = 0;
        CircBuf(int s) { this.s = s; a = new int[s]; }
        void add(int x) { a[r] = x; r = (r + 1) % s; if (c < s) c++; else f = (f + 1) % s; }
        List<Integer> get() { List<Integer> l = new ArrayList<>(); for (int i = 0, j = f; i < c; i++, j = (j + 1) % s) l.add(a[j]); return l; }
    }
}
