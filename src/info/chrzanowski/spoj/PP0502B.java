package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 606. Tablice
 *
 * Kod zadania: PP0502B
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.50
 *
 * @see <a href="http://pl.spoj.pl/problems/PP0502B/">http://pl.spoj.pl/problems/PP0502B/</a>
 * @author Jakub Chrzanowski
 */
public class PP0502B {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, n, counter = Integer.parseInt(reader.readLine());
        String[] values;
        String output;

        while (counter-->0) {
            values = reader.readLine().split(" ");
            output = "";

            n = Integer.parseInt(values[0]);
            for (i = n; i > 0; --i) {
                output += values[i] + " ";
            }

            System.out.println(output.trim());
        }
    }

}
