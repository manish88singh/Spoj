package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1011. Połowa
 *
 * Kod zadania: PP0601B
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.71
 *
 * @see <a href="http://pl.spoj.pl/problems/PP0601B/">http://pl.spoj.pl/problems/PP0601B/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PP0601B {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, n, x, y, counter = Integer.parseInt(reader.readLine());
        String input[], output;

        while (counter-->0) {
            output = "";
            input  = reader.readLine().split(" ");
            n = Integer.parseInt(input[0]);
            x = Integer.parseInt(input[1]);
            y = Integer.parseInt(input[2]);

            for (i = 2; i < n; ++i) {
                if ((i % x == 0) && (i % y != 0)) {
                    if (!output.equals("")) {
                        output += " ";
                    }
                    output += i;
                }
            }

            System.out.println(output);
        }
    }

}
