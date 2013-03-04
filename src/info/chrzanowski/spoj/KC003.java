package info.chrzanowski.spoj;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * 1830. Nierówność trójkąta
 *
 * Kod zadania: KC003
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        3.63
 *
 * @see <a href="http://pl.spoj.pl/problems/KC003/">http://pl.spoj.pl/problems/KC003/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class KC003 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in).useLocale( Locale.ENGLISH );
        float a, b, c;
        boolean r;

        while (scanner.hasNextFloat()) {
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            c = scanner.nextFloat();
            r = (a > 0 && b > 0 && c > 0) && ( (a == b && b == c) || ( (a + b > c) && (a + c > b) && (b + c > a) ) );
            System.out.println(r ? "1" : "0");
        }
    }

}
