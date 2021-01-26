import java.util.Random;
import java.util.Scanner;

public class banan {
    private static String[] ordlista = {"linus", "dennis", "live", "laugh", "hypernervokustiskadiafragmakontravibrationer", "kan", "pluto", "honung", "överdosering", "radiopejlindikator"};
    private static String word = ordlista[new Random().nextInt(ordlista.length)];
    private static String ord = new String(new char[word.length()]).replace("\0","_l");
    private static int försök = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (försök < 25 && ord.contains("_")) {
            System.out.println("Gissa en bokstav");
            System.out.println(ord);
            String gissning = sc.next();
    }
}

    public static void ap(String[] gissning) {
        String ordet = "";
        for (int i = 0; i < word.length(); i++) {
            if (word)
        }

    }





}