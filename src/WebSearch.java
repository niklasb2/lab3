import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebSearch {

    public static void main (String[] args) {

    }

    public static String urlToString (final String url) {

        Scanner urlScanner;
        try {

            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {

            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }
}
