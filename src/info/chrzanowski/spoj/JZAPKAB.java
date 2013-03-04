package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 2598. Kabalistyczny zapis daty
 *
 * Kod zadania: JZAPKAB
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.29
 *
 * @see <a href="http://pl.spoj.pl/problems/JZAPKAB/">http://pl.spoj.pl/problems/JZAPKAB/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class JZAPKAB {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        int i, c,
            d = 0,
            l = input.length();

        for (i = 0; i < l; ++i) {
            c = input.charAt(i) - 96;

            if ( c > 23 ) {
                --c;
            }
            if ( c > 21 ) {
                --c;
            }
            if ( c > 10 ) {
                --c;
            }

            if (c <= 10) {
                d += c;
            } else if (c < 20) {
                d += ( c % 10 + 1 ) * 10;
            } else {
                d += ( c % 10 + 2 ) * 100;
            }
        }
        System.out.println(d);
    }

}
