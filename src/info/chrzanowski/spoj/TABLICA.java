package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 977. Tablica
 *
 * Kod zadania: TABLICA
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.30
 *
 * @see <a href="http://pl.spoj.pl/problems/TABLICA/">http://pl.spoj.pl/problems/TABLICA/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class TABLICA {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] n = reader.readLine().split(" ");
        int i, j = n.length;

        for (i = j - 1; i > 0; --i) {
            System.out.print(n[i] + " ");
        }
        System.out.print(n[0] + "\n");
    }

}
