import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.reverseOrder;

public class MostFrequentNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        HashMap<Integer, Integer> numbersCount = new HashMap<>();

        for (Integer num : nums
                ) {
            if (!numbersCount.containsKey(num)) {
                numbersCount.put(num, 0);
            }
            numbersCount.put(num, numbersCount.get(num) + 1);
        }

        List<Map.Entry<Integer, Integer>> sorted =
                numbersCount
                        .entrySet()
                        .stream()
                        .sorted(reverseOrder(Map.Entry.comparingByValue()))
                        .collect(Collectors.toList());

        for(Map.Entry<Integer, Integer> entry : sorted){
            System.out.println(entry.getKey());
            break;
        }

    }
}
