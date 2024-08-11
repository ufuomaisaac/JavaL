import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamProcessing {

    public static void main(String[] args) {
        // Generating a large list of numbers
        List<Integer> numbers = IntStream.range(0, 100000)
                .boxed()
                .collect(Collectors.toList());

        // Processing in parallel
        long sum = numbers.parallelStream()
                .filter(n -> n % 2 == 0) // Filter even numbers
                .mapToLong(n -> n * 2)   // Double each number
                .sum();                  // Sum them all

        System.out.println("Sum of processed numbers: " + sum);
    }
}

