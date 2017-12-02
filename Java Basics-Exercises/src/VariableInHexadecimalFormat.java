import java.util.Scanner;

public class VariableInHexadecimalFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int number = Integer.parseInt(text, 16);

        System.out.println(number);
    }
}
