import java.util.Random;
import java.util.Scanner;

public class banan {
    private static String[] ordlista = {"linus", "dennis", "live", "laugh", "hypernervokustiskadiafragmakontravibrationer", "kan", "pluto", "honung", "överdosering", "radiopejlindikator"};
    private static String word = ordlista[new Random().nextInt(ordlista.length)];
    private static String ord = new String(new char[word.length()]).replace("\0", "_");
    private static int försök = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (försök < 25 && ord.contains("_")) {
            System.out.println("Gissa en bokstav");
            System.out.println(ord);
            String gissning = sc.next();
            hang(gissning);
        }
        sc.close();
        // Ord gissning, anger antalet försök man får och om det finns några ord kvar att gissa
    }


    public static void hang(String gissning) {
        String ordet = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == gissning.charAt(0)) {
                ordet += gissning.charAt(0);
            } else if (ord.charAt(i) != '_') {
                ordet += gissning.charAt(0);
            } else {
                ordet += '*';
            }
        }
        // gör så att man håller koll på antal gissningar, och + på gissningar i antalet om man har fel

        if (ord.equals(ordet)) {
            försök++;

        }
        if (försök == 1) ;
        {
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 2) ;
        {
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 3) ;
        {
            System.out.println(".____________________.");
            System.out.println("| .__________________|");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 3) ;
        {
            System.out.println(".____________________.");
            System.out.println("| .__________________|");
            System.out.println("| |  / /");
            System.out.println("| | / / ");
            System.out.println("| |/ /");
            System.out.println("| | / ");
            System.out.println("| |/");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 4) ;
        {
            System.out.println(".___________.._______.");
            System.out.println("| .__________))______|");
            System.out.println("| |  / /     ||");
            System.out.println("| | / /      || ");
            System.out.println("| |/ /       ||");
            System.out.println("| | /        ||");
            System.out.println("| |/         ||");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 5) ;
        {
            System.out.println(".___________.._______.");
            System.out.println("| .__________))______|");
            System.out.println("| |  / /     ||       ");
            System.out.println("| | / /      ||       ");
            System.out.println("| |  /       ||.-''.. ");
            System.out.println("| |/         |/  _  | ");
            System.out.println("| |          ||  ./.| ");
            System.out.println("| |          (\\__o.'  ");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 6) ;
        {
            System.out.println(".___________.._______.");
            System.out.println("| .__________))______|");
            System.out.println("| |  / /     ||       ");
            System.out.println("| | / /      ||       ");
            System.out.println("| |  /       ||.-''.. ");
            System.out.println("| |/         |/ _ _ | ");
            System.out.println("| |          || ./. | ");
            System.out.println("| |          (\\_o_.' ");
            System.out.println("| |          .-`--'.  ");
            System.out.println("| |          |.  .|   ");
            System.out.println("| |          |    |   ");
            System.out.println("| |          | .  |   ");
            System.out.println("| |          |    |   ");
            System.out.println("| |          |____  |   ");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 7) ;
        {
            System.out.println(".___________.._______.");
            System.out.println("| .__________))______|");
            System.out.println("| |  / /     ||       ");
            System.out.println("| | / /      ||       ");
            System.out.println("| |  /       ||.-''.. ");
            System.out.println("| |/         |/ _ _ | ");
            System.out.println("| |          || ./. | ");
            System.out.println("| |          (\\_o_.' ");
            System.out.println("| |          .-`--'.  ");
            System.out.println("| |          |.  .|   ");
            System.out.println("| |          |    |   ");
            System.out.println("| |          | .  |   ");
            System.out.println("| |          |    |   ");
            System.out.println("| |          ||^^||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |         / |  | \\ ");
            System.out.println("| |         `-'  `-'  ");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 8) ;
        {
            System.out.println(".___________.._______.");
            System.out.println("| .__________))______|");
            System.out.println("| |  / /     ||       ");
            System.out.println("| | / /      ||       ");
            System.out.println("| |  /       ||.-''.. ");
            System.out.println("| |/         |/ _ _ | ");
            System.out.println("| |          || ./. | ");
            System.out.println("| |          (\\_o_.' ");
            System.out.println("| |          .-`--'.  ");
            System.out.println("| |        /Y .  . Y\\");
            System.out.println("| |       // |    |  \\ ");
            System.out.println("| |      //  | .  |   \\\\");
            System.out.println("| |     ')   |    |   (`");
            System.out.println("| |          ||^^||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |         / |  | \\ ");
            System.out.println("| |         `-'  `-'  ");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|^^^^^^^^^^|^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
        if (försök == 9) ;
        {
            System.out.println(".___________.._______.");
            System.out.println("| .__________))______|");
            System.out.println("| |  / /     ||       ");
            System.out.println("| | / /      ||       ");
            System.out.println("| |  /       ||.-''.. ");
            System.out.println("| |/         |/ _ _ | ");
            System.out.println("| |          || ./. | ");
            System.out.println("| |          (\\_o_.' ");
            System.out.println("| |          .-`--'.  ");
            System.out.println("| |        /Y . .  Y\\");
            System.out.println("| |       // |    |  \\ ");
            System.out.println("| |      //  | .  |   \\\\");
            System.out.println("| |     ')   |    |   (`");
            System.out.println("| |          ||^^||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |          ||  ||   ");
            System.out.println("| |         / |  | \\ ");
            System.out.println("| |         `-'  `-'  ");
            System.out.println("| |");
            System.out.println("^^^^^^^^^^^^^|_`-' `-' |^^^^^|");
            System.out.println("|^|^^^^^^^^^^|^^^^^^^^^^|^^^| |");
            System.out.println("| |                         | |");
            System.out.println(": :                         : :");
            System.out.println(". |                         . .");
        }
    }
}