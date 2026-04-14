import java.util.*;

public class SetTasks {
    public static boolean eq(Set<Integer> a, Set<Integer> b) {
        return a.equals(b);
    }

    public static Set<Integer> uni(Set<Integer> a, Set<Integer> b) {
        Set<Integer> r = new HashSet<>(a);
        r.addAll(b);
        return r;
    }

    public static Set<Integer> inter(Set<Integer> a, Set<Integer> b) {
        Set<Integer> r = new HashSet<>(a);
        r.retainAll(b);
        return r;
    }

    public static Set<Integer> symDiff(Set<Integer> a, Set<Integer> b) {
        Set<Integer> r = new HashSet<>(a);
        r.addAll(b);
        Set<Integer> t = new HashSet<>(a);
        t.retainAll(b);
        r.removeAll(t);
        return r;
    }

    public static List<Integer> toSortedList(Set<Integer> a) {
        List<Integer> l = new ArrayList<>(a);
        Collections.sort(l);
        return l;
    }

    public static boolean isSub(Set<Integer> a, Set<Integer> b) {
        return b.containsAll(a);
    }
}
