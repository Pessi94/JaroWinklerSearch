import java.util.Arrays;

public class SearchThreadHelper {

    public void startNewThreads(String[] words, String wordToFind, int threadCount) {
        int startIndex = 0;
        int subArraySize = words.length / threadCount;

        for (int i = 0; i < threadCount; i++) {
            new Thread(new SearchThread(Arrays.copyOfRange(words, startIndex, startIndex + subArraySize), wordToFind.toLowerCase())).start();
            startIndex += subArraySize;
        }
    }

}
