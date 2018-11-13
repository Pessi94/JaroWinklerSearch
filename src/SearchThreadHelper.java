import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SearchThreadHelper {

    public void startNewThreads(String[] words, String wordToFind, int threadCount) throws InterruptedException {
        ArrayList<Runnable> runnableList = new ArrayList<>();
        int subArraySize = words.length / threadCount;
        int index = subArraySize + (words.length % threadCount);

        runnableList.add(new SearchThread(0, Arrays.copyOfRange(words, 0, index), wordToFind.toLowerCase()));
        for (int i = 0; i < threadCount - 1; i++) {
            runnableList.add(new SearchThread(index, Arrays.copyOfRange(words, index, index + subArraySize), wordToFind.toLowerCase()));
            index += subArraySize;
        }

        ExecutorService threadService = Executors.newFixedThreadPool(threadCount);
        for (Runnable runnable : runnableList) {
            threadService.execute(runnable);
        }
        threadService.shutdown();
        threadService.awaitTermination(30, TimeUnit.SECONDS);
    }

}
