public class Main {

    public static final String TEXT =
            "Na tapczanie siedzi leń,\n" +
            "Nic nie robi cały dzień.\n" +
            "\n" +
            "\"O, wypraszam to sobie!\n" +
            "Jak to? Ja nic nie robię?\n" +
            "A kto siedzi na tapczanie?\n" +
            "A kto zjadł pierwsze śniadanie?\n" +
            "A kto dzisiaj pluł i łapał?\n" +
            "A kto się w głowę podrapał?\n" +
            "A kto dziś zgubił kalosze?\n" +
            "O - o! Proszę!\"\n" +
            "\n" +
            "Na tapczanie siedzi leń,\n" +
            "Nic nie robi cały dzień.\n" +
            "\n" +
            "\"Przepraszam! A tranu nie piłem?\n" +
            "A uszu dzisiaj nie myłem?\n" +
            "A nie urwałem guzika?\n" +
            "A nie pokazałem języka?\n" +
            "A nie chodziłem się strzyc?\n" +
            "To wszystko nazywa się nic?\"\n" +
            "\n" +
            "Na tapczanie siedzi leń,\n" +
            "Nic nie robi cały dzień.\n" +
            "\n" +
            "Nie poszedł do szkoły, bo mu się nie chciało,\n" +
            "Nie odrobił lekcji, bo czasu miał za mało,\n" +
            "Nie zasznurował trzewików, bo nie miał ochoty,\n" +
            "Nie powiedział \"dzień dobry\", bo z tym za dużo roboty,\n" +
            "Nie napoił Azorka, bo za daleko jest woda,\n" +
            "Nie nakarmił kanarka, bo czasu mu było szkoda.\n" +
            "Miał zjeść kolację - tylko ustami mlasnął,\n" +
            "Miał położyć się - nie zdążył - zasnął.\n" +
            "Śniło mu się, że nad czymś ogromnie się trudził.\n" +
            "Tak zmęczył się tym snem, że się obudził.";

    public static final String WORD_TO_FIND = "na";

    public static void main(String[] args) {
        JaroWinkler jaroWinkler = new JaroWinkler();
        String[] words = TEXT.toLowerCase().split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(i + ": " + words[i]);
        }

        for (int i = 0; i < words.length; i++) {
            if (jaroWinkler.calculateSimilarity(words[i], WORD_TO_FIND.toLowerCase()) == 1D) {
                System.out.println("Index znalezionego słowa to: " + i);
            }
        }
    }

}
