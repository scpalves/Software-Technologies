import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BombNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] field = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] bombAndDamage = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <field.length; i++) {
            numbers.add(field[i]);
        }

        int index = bombAndDamage[0];
        int damage = bombAndDamage[1];

        while (numbers.indexOf(index) != -1){
            int bombIndex = numbers.indexOf(index);
            int bombStartRange = Math.max(0, bombIndex - damage);
            int bombEndRange = Math.min(numbers.size() - 1, bombIndex + damage);

            for (int i = bombStartRange; i <= bombEndRange; i++) {
                numbers.remove(bombStartRange);
            }
        }

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
