package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 675. EUCGAMEnder
 *
 * Kod zadania: EUCGAME
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.61
 * Rezultat:    10
 *
 * @see <a href="http://pl.spoj.pl/problems/EUCGAME/">http://pl.spoj.pl/problems/EUCGAME/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class EUCGAME {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, counter = Integer.parseInt(reader.readLine());
        String ab[];

        while (counter-->0) {
            ab = reader.readLine().split(" ");
            a  = Integer.parseInt(ab[0]);
            b  = Integer.parseInt(ab[1]);

            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }

            System.out.println(String.valueOf(a*2));
        }
    }

}
