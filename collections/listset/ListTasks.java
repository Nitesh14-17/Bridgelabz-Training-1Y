import java.util.*;

public class ListTasks {
    public static List<Integer> reverseArrayList(List<Integer> a) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int t = a.get(l);
            a.set(l, a.get(r));
            a.set(r, t);
            l++;
            r--;
        }
        return a;
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> a) {
        int l = 0, r = a.size() - 1;
        while (l < r) {
            int t = a.get(l);
            a.set(l, a.get(r));
            a.set(r, t);
            l++;
            r--;
        }
        return a;
    }

    public static Map<String, Integer> freq(List<String> a) {
        Map<String, Integer> m = new HashMap<>();
        for (String s : a) {
            m.put(s, m.getOrDefault(s, 0) + 1);
        }
        return m;
    }

    public static List<Integer> rotate(List<Integer> a, int k) {
        int n = a.size();
        k = k % n;
        List<Integer> b = new ArrayList<>();
        for (int i = k; i < n; i++) b.add(a.get(i));
        for (int i = 0; i < k; i++) b.add(a.get(i));
        return b;
    }

    public static List<Integer> removeDup(List<Integer> a) {
        Set<Integer> s = new LinkedHashSet<>();
        for (int x : a) s.add(x);
        return new ArrayList<>(s);
    }

    public static <T> T nthFromEnd(LinkedList<T> a, int n) {
        var f = a.listIterator();
        var s = a.listIterator();
        for (int i = 0; i < n; i++) if (f.hasNext()) f.next();
        while (f.hasNext()) {
            f.next();
            s.next();
        }
        return s.next();
    }
}
