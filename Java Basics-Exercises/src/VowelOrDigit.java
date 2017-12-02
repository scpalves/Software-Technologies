import java.util.Scanner;

public class VowelOrDigit {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char symbol = scanner.next().charAt(0);

        switch (symbol) {
            case 'a':
            case 'i':
            case 'o':
            case 'u':
            case 'y':
            case 'e':
                System.out.println("vowel");
                break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                System.out.println("digit");
                break;
                default:
                    System.out.println("other");
                    break;
        }
    }
}
