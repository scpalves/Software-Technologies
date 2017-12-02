import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChangeToUpperCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "(<upcase>)(.*?)(<\\/upcase>)";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()){
           input = input.replace(matcher.group(2), matcher.group(2).toUpperCase());
           input = input.replace(matcher.group(1), "");
           input = input.replace(matcher.group(3), "");
        }

        System.out.println(input);
    }
}
