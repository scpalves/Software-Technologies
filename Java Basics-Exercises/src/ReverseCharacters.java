import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseCharacters {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char firstLetter = scanner.next().charAt(0);
        char secondLetter = scanner.next().charAt(0);
        char thirdLetter = scanner.next().charAt(0);

        System.out.println(thirdLetter + "" + secondLetter + "" + firstLetter);
    }
}
