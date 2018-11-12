
public class SearchThread implements Runnable {

    private final int wordsArrayStartIndex;
    private final String[] words;
    private final String wordToFind;

    public SearchThread(int wordsArrayStartIndex, String[] words, String wordToFind) {
        this.wordsArrayStartIndex = wordsArrayStartIndex;
        this.words = words;
        this.wordToFind = wordToFind;
    }

    @Override
    public void run() {
        JaroWinkler jaroWinkler = new JaroWinkler();

        for (int i = 0; i < words.length; i++) {
            if (jaroWinkler.calculateSimilarity(words[i], wordToFind) == 1D) {
                System.out.println("Wątek: " + Thread.currentThread().getId() + ", Index znalezionego słowa to: " + (wordsArrayStartIndex + i));
            }
        }
    }

}
