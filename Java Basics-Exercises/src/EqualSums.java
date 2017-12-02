import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class EqualSums {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int totalSum = 0;

        for(int number : numbers){
            totalSum += number;
        }

        int leftSum = 0;
        int index = 0;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            totalSum -= numbers[i];

            if(totalSum == leftSum){
                index = i;
                isFound = true;
                break;
            }

            leftSum += numbers[i];
        }

        if(isFound){
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}
