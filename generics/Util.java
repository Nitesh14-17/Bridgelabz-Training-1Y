public class Util {
    public static <T> boolean isEqual(T a, T b) {
        if (a == null) return b == null;
        return a.equals(b);
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) max = y;
        if (z.compareTo(max) > 0) max = z;
        return max;
    }
}
