import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparableL {

    public static void main(String[] args) {

        Comparable<Integer> com = new Comparable<Integer>() {


            @Override
            public int compareTo(Integer o) {
                return 1;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(5);
        nums.add(13);
        nums.add(12);

        Collections.sort(nums);

        System.out.println(nums);
    }
}
