public class Main {

    public static void main(String[] args) {
        JaroWinkler jaroWinkler = new JaroWinkler();

        System.out.println(jaroWinkler.calculateSimilarity("DWAYNE", "DUANE")); //komentarz
        System.out.println(jaroWinkler.calculateSimilarity("MARTHA ", "MARHTA "));
    }
}
