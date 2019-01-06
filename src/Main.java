import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static final String WORD_TO_FIND = "drukuje";
    public static final int THREADS_COUNT = 4;

    public static void main(String[] args) {
        SearchThreadHelper searchThreadHelper = new SearchThreadHelper();
        String[] words = readWords();

        try {
            long startTime = System.nanoTime();
            searchThreadHelper.startNewThreads(words, WORD_TO_FIND, THREADS_COUNT);
            System.out.println("Czas działania: " + (System.nanoTime() - startTime) + " nanosekund");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static String[] readWords(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("words2.txt"));
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
