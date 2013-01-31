package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 708. Problem Collatza
 *
 * Kod zadania: PTCLTZ
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.41
 *
 * @see <a href="http://pl.spoj.pl/problems/PTCLTZ/">http://pl.spoj.pl/problems/PTCLTZ/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PTCLTZ {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, s, counter = Integer.parseInt(reader.readLine().trim());

        while (counter-->0) {
            n = 0;
            s = Integer.parseInt(reader.readLine().trim());

            while ( s != 1 ) {
                if (s % 2 == 1) {
                    s *= 3;
                    s += 1;
                } else {
                    s /= 2;
                }
                ++n;
            }

            System.out.println(String.valueOf(n));
        }
    }

}
