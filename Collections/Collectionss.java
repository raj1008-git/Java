import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collectionss {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(8);
        System.out.println(nums.indexOf(2));
        System.out.println(nums.get(1));
        for (Object n : nums) {
            System.out.println((int) n);
        }
    }
}
