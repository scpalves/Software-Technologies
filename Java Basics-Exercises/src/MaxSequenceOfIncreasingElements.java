import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfIncreasingElements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

       ArrayList<Integer> currentSequence = new ArrayList<>();
        currentSequence.add(numbers[0]);
        ArrayList<Integer> bestSequence = new ArrayList<>();

        int lenght = 1;
        int bestLenghtOfIncreasingElements = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            int currentNum = numbers[i];
            int nextNum = numbers[i + 1];

            if(currentNum < nextNum){
                lenght++;
                currentSequence.add(nextNum);

                if(lenght > bestLenghtOfIncreasingElements){
                    bestLenghtOfIncreasingElements = lenght;
                    bestSequence.clear();
                    bestSequence.addAll(currentSequence);
                }
            } else {
                lenght = 1;
                currentSequence.clear();
                currentSequence.add(nextNum);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < bestSequence.size(); i++) {
            sb.append(bestSequence.get(i).toString() + " ");
        }

        System.out.println(sb);
    }
}
