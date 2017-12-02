import java.util.*;

public class Phonebook {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeMap<String, String> phoneBook = new TreeMap<>();


        while (!input.equals("END")) {
            String[] tokens = input
                    .split("\\s+");

            String command = tokens[0];

            if (command.equals("A")) {
                String name = tokens[1];
                String phoneNumber = tokens[2];

                if (!phoneBook.containsKey(name)) {
                    phoneBook.put(name, "");
                }
                phoneBook.put(name, phoneNumber);

            } else if (command.equals("S")) {
                String name = tokens[1];

                if (phoneBook.containsKey(name)) {
                    System.out.println(name + " -> " + phoneBook.get(name));
                } else {
                    System.out.print("Contact " + name + " does not exist.\n");
                }

            } else if (command.equals("ListAll")) {

                for (Map.Entry user : phoneBook.entrySet()
                        ) {
                    System.out.println(user.getKey() + " -> " + user.getValue());
                }
            }
            input = scanner.nextLine();
        }

    }
}
