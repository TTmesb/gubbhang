import java.util.Random;
import java.util.Scanner;

public class hangagubbe {
    private static String[] ordlista = {"linus", "dennis", "live", "laugh", "hypernervokustiskadiafragmakontravibrationer", "kan", "pluto", "honung", "överdosering", "radiopejlindikator"};
    private static String word = ordlista[new Random().nextInt(ordlista.length)];
    private static String gissning = new String(new char[word.length()]).replace("\0","☺"));
    private static int försök = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (försök < 35 && gissning.contains("☺")) {
            System.out.println("Gissa en bokstav");
            System.out.println(gissning);
    }

}