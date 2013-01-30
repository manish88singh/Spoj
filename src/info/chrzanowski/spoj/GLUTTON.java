package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 626. Obżartuchy
 *
 * Kod zadania: GLUTTON
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.44
 *
 * @see <a href="http://pl.spoj.pl/problems/GLUTTON/">http://pl.spoj.pl/problems/GLUTTON/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class GLUTTON {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, m, counter = Integer.parseInt(reader.readLine());
        double c;
        String nm[];

        while (counter-->0) {
            nm = reader.readLine().split(" ");
            n  = Integer.parseInt(nm[0]);
            m  = Integer.parseInt(nm[1]);
            c  = 0;

            while (n-->0) {
                c += ( 86400 / Integer.parseInt(reader.readLine()) );
            }

            System.out.println((int) Math.ceil(c / m));
        }
    }

}
