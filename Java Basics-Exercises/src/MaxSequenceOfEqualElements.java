import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MaxSequenceOfEqualElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int equalElements = 1;
        int element = 0;
        int bestLenghtOfEqualElements = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int currentNumber = nums[i];
            int nextNumber = nums[i + 1];

            if(currentNumber == nextNumber){
                equalElements++;

                if(equalElements > bestLenghtOfEqualElements){
                    bestLenghtOfEqualElements = equalElements;
                    element = 0;
                    element = currentNumber;
                }
            } else {
                equalElements = 1;
            }
        }

        String result = "";

        for (int i = 0; i < bestLenghtOfEqualElements; i++) {
            result += element + " ";
        }

        System.out.println(result);
    }
}
