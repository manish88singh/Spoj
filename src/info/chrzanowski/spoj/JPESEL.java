package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1261. Pesel
 *
 * Kod zadania: JPESEL
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.29
 *
 * @see <a href="http://pl.spoj.pl/problems/JPESEL/">http://pl.spoj.pl/problems/JPESEL/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class JPESEL {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, sum,
            counter = Integer.parseInt(reader.readLine()),
            mods[]  = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3, 1};
        String line;

        while (counter-->0) {
            line = reader.readLine();
            sum  = 0;
            for (i = 0; i < 11; ++i) {
                sum += (line.charAt(i) - 48) * mods[i];
            }

            System.out.println(sum % 10 == 0 ? "D" : "N");
        }
    }

}
