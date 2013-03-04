package info.chrzanowski.spoj;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * 1830. Nierówność trójkąta
 *
 * Kod zadania: JROWLIN
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        1.77
 *
 * @see <a href="http://pl.spoj.pl/problems/JROWLIN/">http://pl.spoj.pl/problems/JROWLIN/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class JROWLIN {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale( Locale.ENGLISH );
        float a = scanner.nextFloat(),
              b = scanner.nextFloat(),
              c = scanner.nextFloat();
              b -= c;

        if (a == 0 && b == 0) {
            System.out.println("NWR");
        } else if (a == 0 && b != 0) {
            System.out.println("BR");
        } else {
            System.out.println(String.format(Locale.ENGLISH, "%.2f", -b / a));
        }
    }

}
