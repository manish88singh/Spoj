package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1910. Odwracanie wyrazów
 *
 * Kod zadania: KC009
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.72
 *
 * @see <a href="http://pl.spoj.pl/problems/KC009/">http://pl.spoj.pl/problems/KC009/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class KC009 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = reader.readLine()) != null) {
            System.out.println(new StringBuffer(line).reverse().toString());
        }
    }

}
