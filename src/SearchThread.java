public class SearchThread implements Runnable {

    private final String[] words;
    private final String wordToFind;

    public SearchThread(String[] words, String wordToFind) {
        this.words = words;
        this.wordToFind = wordToFind;
    }

    @Override
    public void run() {
        JaroWinkler jaroWinkler = new JaroWinkler();

        for (int i = 0; i < words.length; i++) {
            System.out.println(Thread.currentThread().getId() + ": " + words[i]);
            if (jaroWinkler.calculateSimilarity(words[i], wordToFind) == 1D) {
                System.out.println("Index znalezionego słowa to: " + i);
            }
        }
    }

}
