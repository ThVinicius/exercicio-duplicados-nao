
public class App {
    public static void main(String[] args) throws Exception {
        String[] frutas1 = { "Morango", "Uva", "Acerola", "Manga" };
        String[] frutas2 = { "Pêra", "Caju", "Morango", "Kiwi" };

        for (String fruta1 : frutas1) {

            for (String fruta2 : frutas2) {

                if (fruta1 == fruta2) {
                    System.out.println(fruta1);

                    break;
                }
            }

        }

    }
}
