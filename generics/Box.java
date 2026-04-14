public class Box<T> {
    private T val;
    public void set(T v) {
        val = v;
    }
    public T get() {
        return val;
    }
}
