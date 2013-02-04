package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 675. SkarbFinder
 *
 * Kod zadania: SKARBFI
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.30
 *
 * @see <a href="http://pl.spoj.pl/problems/SKARBFI/">http://pl.spoj.pl/problems/SKARBFI/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class SKARBFI {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, a, b, h, v, counter = Integer.parseInt(reader.readLine());
        String ab[];

        while (counter-->0) {
            n = Integer.parseInt(reader.readLine());
            h = v = 0;

            while (n-->0) {
                ab = reader.readLine().split(" ");
                a  = Integer.parseInt(ab[0]);
                b  = Integer.parseInt(ab[1]);

                switch (a) {
                    case 0:
                        v += b;
                        break;
                    case 1:
                        v -= b;
                        break;
                    case 2:
                        h -= b;
                        break;
                    case 3:
                        h += b;
                        break;
                }
            }

            if (h == 0 && v == 0) {
                System.out.println("studnia");
            } else {
                if (v > 0) {
                    System.out.println("0 " + v);
                } else if (v < 0) {
                    System.out.println("1 " + Math.abs(v));
                }
                if (h > 0) {
                    System.out.println("3 " + h);
                } else if (h < 0) {
                    System.out.println("2 " + Math.abs(h));
                }
            }
        }
    }

}
