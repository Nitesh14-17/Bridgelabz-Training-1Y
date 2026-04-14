package task;

import java.util.*;

class Order {
    int id;
    String item;
    Order(int id, String item) { this.id = id; this.item = item; }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order x = (Order) o;
        return id == x.id;
    }
    public int hashCode() { return Objects.hash(id); }
    public String toString() { return id + ":" + item; }
}

public class ecom {
    List<Order> all = new ArrayList<>();
    Set<Order> uniq = new HashSet<>();
    Queue<Order> q = new LinkedList<>();
    Stack<Order> stk = new Stack<>();

    void addOrd(int id, String item) { all.add(new Order(id, item)); }

    void rmDup() { uniq.clear(); uniq.addAll(all); }

    void fillQ() { q.clear(); q.addAll(uniq); }

    void proc() {
        while (!q.isEmpty()) {
            Order o = q.remove();
            if (o.id % 2 == 0) stk.push(o); // fail if id even
            else System.out.println("ok " + o);
        }
    }

    void retry() {
        while (!stk.isEmpty()) {
            Order o = stk.pop();
            System.out.println("retry " + o);
        }
    }

    public static void main(String[] args) {
        ecom sys = new ecom();
        sys.addOrd(1, "pen"); sys.addOrd(2, "book"); sys.addOrd(1, "pen"); sys.addOrd(4, "bag");
        sys.rmDup();
        sys.fillQ();
        sys.proc();
        sys.retry();
    }
}
