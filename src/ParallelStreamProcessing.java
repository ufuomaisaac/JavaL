import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


//Streams makes you do things in a faster way that is, it allows declarative programming,
// enabling developer to work faster and easier
public class ParallelStreamProcessing {

    public static void main(String[] args) {
        sumValues();
        doubleValue();

    }
    //GPT
    public static void sumValues() {
        // Generating a large list of numbers
        List<Integer> numbers = IntStream.range(0, 10000)
                .boxed()
                .collect(Collectors.toList());

        // Processing in parallel
        long sum = numbers.stream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .mapToLong(n -> n * 2)   // Double each number
                .sum();                  // Sum them all

        System.out.println("Sum of processed numbers: " + sum);

    }

    //Telusko
    public static void doubleValue() {
        List<Integer> nums = Arrays.asList(4,5,7,2,8);

        int sum = 0;
        for(int n : nums) {
            if(n % 2 == 0) {
                n = n * 2;
                sum += n;
            }
        }
        System.out.println(sum);
    }

}


