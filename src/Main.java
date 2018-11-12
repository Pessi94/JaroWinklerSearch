import java.util.Arrays;

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

    public static void main(String[] args) {
        JaroWinkler jaroWinkler = new JaroWinkler();
        String[] words = TEXT.split(" ");

//        for (int i = 0; i < words.length; i++) {
//            System.out.println(i + ": " + words[i]);
//        }

        new Thread(new SearchThread(Arrays.copyOfRange(words, 0, words.length / 2), WORD_TO_FIND)).start();
        new Thread(new SearchThread(Arrays.copyOfRange(words, words.length / 2, words.length), WORD_TO_FIND)).start();
    }

}
