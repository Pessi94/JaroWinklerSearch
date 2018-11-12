import java.util.Arrays;

public class SearchThreadHelper {

    public void startNewThreads(String[] words, String wordToFind, int threadCount) {
        int subArraySize = words.length / threadCount;
        int index = subArraySize + (words.length % threadCount);

        new Thread(new SearchThread(0, Arrays.copyOfRange(words, 0, index), wordToFind.toLowerCase())).start();
        for (int i = 0; i < threadCount - 1; i++) {
            new Thread(new SearchThread(index, Arrays.copyOfRange(words, index, index + subArraySize), wordToFind.toLowerCase())).start();
            index += subArraySize;
        }
    }

}
