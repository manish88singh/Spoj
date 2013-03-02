package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1055. Parzyste nieparzyste
 *
 * Kod zadania: PP0602A
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.32
 *
 * @see <a href="http://pl.spoj.pl/problems/PP0602A/">http://pl.spoj.pl/problems/PP0602A/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PP0602A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, i, counter = Integer.parseInt(reader.readLine());
        String data[], output;

        while (counter-->0) {
            data   = reader.readLine().split(" ");
            n      = Integer.parseInt(data[0]);
            output = "";

            for (i = 2; i <= n; i+=2) {
                output += data[i] + " ";
            }
            for (i = 1; i <= n; i+=2) {
                output += data[i] + " ";
            }

            System.out.println(output.trim());
        }
    }

}
