import java.util.*;

public class PriceList {
    public static void main(String[] args) {
        double[] arr = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();
        for (double d : arr) list.add(d);
        double max = Collections.max(list);
        double sum = 0;
        for (double d : list) sum += d;
        double avg = sum / list.size();
        System.out.println(max);
        System.out.println(avg);
    }
}
