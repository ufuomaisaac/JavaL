import java.util.ArrayList;
import java.util.List;

public class CollectionL {
    public static void main(String arg[]){

//List can allow repeated values
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(50);
        nums.add(11);
        nums.add(12);
        nums.add(18);
        nums.add(44);
        nums.add(45);

       // int num = new Integer(44);


        System.out.println(nums.indexOf(11));
       // System.out.println(nums.add(4, num));
    }
}
