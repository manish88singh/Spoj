package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 496. Dwie cyfry silnii
 *
 * Kod zadania: FCTRL3
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.28
 *
 * @see <a href="http://pl.spoj.pl/problems/FCTRL3/">http://pl.spoj.pl/problems/FCTRL3/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class FCTRL3 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = Integer.parseInt(reader.readLine());

        while (counter-->0) {
            int input = Integer.parseInt(reader.readLine());

            if ( input < 10 ) {
                switch (input) {

                    case 0:
                    case 1:
                        System.out.println("0 1");
                        break;

                    case 2:
                        System.out.println("0 2");
                        break;

                    case 3:
                        System.out.println("0 6");
                        break;

                    case 4:
                        System.out.println("2 4");
                        break;

                    case 5:
                    case 6:
                    case 8:
                        System.out.println("2 0");
                        break;

                    case 7:
                        System.out.println("4 0");
                        break;

                    case 9:
                        System.out.println("8 0");
                        break;

                }
            } else {
                System.out.println("0 0");
            }

        }
    }

}
