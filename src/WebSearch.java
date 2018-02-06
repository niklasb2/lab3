import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class WebSearch {

    public static void main (String[] args) {

       // System.out.println(urlToString("http://erdani.com/tdpl/hamlet.txt"));

        System.out.println("=============================================================================================");

        System.out.println("Word Count: ");
        System.out.println(totalWordCount("one two three"));
        System.out.println("Chosen Word Count: ");
        System.out.println(chosenWordCount("Get thee to a nunnery", "thee"));
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

    public static int totalWordCount (final String stream) {

        int wordCount = 0;

        String[] streamLine = stream.split("\n");
        String[] streamText;

        for (int i = 0; i <= streamLine.length - 1; i++) {

            streamText = streamLine[i].split(" ");

            wordCount = streamText.length;
        }

        return wordCount;
    }

    public static int chosenWordCount (final String stream, final String chosen) {

        int chosenWordCount = 0;

        String[] streamLine = stream.split("\n");
        String[] streamText;

        for (int i = 0; i <= streamLine.length - 1; i++) {

            streamText = streamLine[i].split(" ");

            for (int j = 0; j <= streamText.length - 1; j++) {

                if (streamText[j].equals(chosen)) {

                    chosenWordCount++;
                }
            }
        }

        return chosenWordCount;
    }
}
