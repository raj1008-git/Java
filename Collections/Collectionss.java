import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collectionss {
    public static void main(String[] args) {
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(8);
        nums.add(10);
        nums.add(12);
        nums.add(13);
        nums.add(13);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext())
            System.out.println(values.next());
    }
}
