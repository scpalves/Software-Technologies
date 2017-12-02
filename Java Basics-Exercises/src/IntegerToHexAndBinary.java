import java.util.Scanner;

public class IntegerToHexAndBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String hexadecimal = Integer.toString(number, 16);
        String binary = Integer.toString(number, 2);

        System.out.println(hexadecimal.toUpperCase());
        System.out.println(binary);
    }
}
