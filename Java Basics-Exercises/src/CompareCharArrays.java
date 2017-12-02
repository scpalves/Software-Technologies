import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class CompareCharArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] firstInput = scanner.nextLine().replace(" ", "").toCharArray();
        char[] secondInput = scanner.nextLine().replace(" ", "").toCharArray();

        if (firstInput.length < secondInput.length){
            System.out.println(firstInput);
            System.out.println(secondInput);
        } else if (firstInput.length > secondInput.length){
            System.out.println(secondInput);
            System.out.println(firstInput);
        } else {

            for (int i = 0; i < firstInput.length; i++) {
                if (firstInput[i] < secondInput[i]){
                    System.out.println(firstInput);
                    System.out.println(secondInput);
                    break;
                } else if (firstInput[i] > secondInput[i]){
                    System.out.println(secondInput);
                    System.out.println(firstInput);
                    break;
                } else{
                    System.out.println(secondInput);
                    System.out.println(firstInput);
                    break;
                }
            }
        }
    }
}
