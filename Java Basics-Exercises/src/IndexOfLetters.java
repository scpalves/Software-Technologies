import java.util.Scanner;

public class IndexOfLetters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (char letter: input.toCharArray()
             ) {
            System.out.println(letter + " -> " + (letter - 97));
        }
    }
}
