package info.chrzanowski.spoj;

import java.io.IOException;
import java.util.Scanner;

/**
 * 1844. Zliczanie wystąpień
 *
 * Kod zadania: KC004
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        7.90
 *
 * @see <a href="http://pl.spoj.pl/problems/KC004/">http://pl.spoj.pl/problems/KC004/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class KC004 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int s, c, r;

        while (scanner.hasNextInt()) {
            s = scanner.nextInt();
            c = scanner.nextInt();
            r = 0;

            while (c-->0) {
                if (s == scanner.nextInt()) {
                    ++r;
                }
            }
            System.out.println(r);
        }
    }
}
