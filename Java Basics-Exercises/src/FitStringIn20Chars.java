import java.util.Scanner;

public class FitStringIn20Chars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.length() >= 20){
            input = input.substring(0, 20);
        } else {
            while(input.length() != 20){
                input += "*";
            }
        }

        System.out.println(input);
    }
}
