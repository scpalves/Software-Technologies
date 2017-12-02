import java.util.Scanner;

public class URLParser {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();
        String protocol = "";
        String server = "";
        String resource = "";

        if (url.contains("://")) {
            int protocolIndex = url.indexOf("://");
            protocol = url.substring(0, protocolIndex);
            url = url.replace(protocol + "://", "");
        }

        if (url.contains("/")) {
            int serverIndex = url.indexOf("/");
            server = url.substring(0, serverIndex);
            url = url.replace(server + "/", "");
        } else {
            server = url;
            url = url.replace(server, "");
        }

        if (url.length() > 0) {
            resource = url;
        }


        System.out.println("[protocol] = " + "\"" + protocol + "\"");
        System.out.println("[server] = " + "\"" + server + "\"");
        System.out.println("[resource] = " + "\"" + resource + "\"");
    }
}
