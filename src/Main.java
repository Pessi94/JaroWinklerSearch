import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static final String WORD_TO_FIND = "na";

    public static void main(String[] args) {
        JaroWinkler jaroWinkler = new JaroWinkler();
        String[] words = readWords();

        writeWords(words);

        long startTime = System.nanoTime();
        search(words);
        System.out.println("Czas działania: " + (System.nanoTime() - startTime) + " nanosekund");
    }

    private static void writeWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            System.out.println(i + ": " + words[i]);
        }
    }

    private static void search(String[] words) {
        JaroWinkler jaroWinkler = new JaroWinkler();

        for (int i = 0; i < words.length; i++) {
            if (jaroWinkler.calculateSimilarity(words[i], WORD_TO_FIND) == 1D) {
                System.out.println("Index znalezionego słowa to: " + i);
            }
        }
    }

    private static String[] readWords(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            ArrayList<String> words = new ArrayList<>();
            String word;

            while (true) {
                word = reader.readLine();
                if (word == null) {
                    break;
                }
                words.add(word);
            }

            return words.toArray(new String[0]);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
