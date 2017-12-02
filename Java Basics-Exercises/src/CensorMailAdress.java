import java.util.Scanner;

public class CensorMailAdress {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();
        String username = email.split("@")[0];
        String domain = email.split("@")[1];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < username.length(); i++) {
            result.append("*");
        }

        result.append("@" + domain);

        while (text.contains(email)) {
            text = text.replace(username + "@" + domain, result);
        }

        System.out.println(text);
    }
}
