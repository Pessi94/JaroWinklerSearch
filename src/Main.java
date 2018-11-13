
public class Main {

    public static final String TEXT =
            "Na tapczanie siedzi leń, " +
            "Nic nie robi cały dzień. " +
            "\"O, wypraszam to sobie! " +
            "Jak to? Ja nic nie robię? " +
            "A kto siedzi na tapczanie? " +
            "A kto zjadł pierwsze śniadanie? " +
            "A kto dzisiaj pluł i łapał? " +
            "A kto się w głowę podrapał? " +
            "A kto dziś zgubił kalosze? " +
            "O - o! Proszę!\" " +
            "Na tapczanie siedzi leń, " +
            "Nic nie robi cały dzień. " +
            "\"Przepraszam! A tranu nie piłem? " +
            "A uszu dzisiaj nie myłem? " +
            "A nie urwałem guzika? " +
            "A nie pokazałem języka? " +
            "A nie chodziłem się strzyc? " +
            "To wszystko nazywa się nic?\" " +
            "Na tapczanie siedzi leń, " +
            "Nic nie robi cały dzień. " +
            "Nie poszedł do szkoły, bo mu się nie chciało, " +
            "Nie odrobił lekcji, bo czasu miał za mało, " +
            "Nie zasznurował trzewików, bo nie miał ochoty, " +
            "Nie powiedział \"dzień dobry\", bo z tym za dużo roboty, " +
            "Nie napoił Azorka, bo za daleko jest woda, " +
            "Nie nakarmił kanarka, bo czasu mu było szkoda. " +
            "Miał zjeść kolację - tylko ustami mlasnął, " +
            "Miał położyć się - nie zdążył - zasnął. " +
            "Śniło mu się, że nad czymś ogromnie się trudził. " +
            "Tak zmęczył się tym snem, że się obudził. ";

    public static final String WORD_TO_FIND = "na";
    public static final int THREADS_COUNT = 4;

    public static void main(String[] args) {
        String[] words = TEXT.toLowerCase().split(" ");
        SearchThreadHelper searchThreadHelper = new SearchThreadHelper();

        try {
            long startTime = System.nanoTime();
            searchThreadHelper.startNewThreads(words, WORD_TO_FIND, THREADS_COUNT);
            System.out.println("Czas działania: " + (System.nanoTime() - startTime) + " nanosekund");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
