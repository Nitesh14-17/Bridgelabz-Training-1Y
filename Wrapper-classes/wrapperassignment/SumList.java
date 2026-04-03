import java.util.ArrayList;

public class SumList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(15);
        nums.add(10);
        nums.add(15);
        int sum = 0;
        for (int n : nums) sum += n;
        System.out.println(sum);
    }
}
