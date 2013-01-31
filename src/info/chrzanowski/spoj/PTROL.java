package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 723. ROL
 *
 * Kod zadania: PTROL
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.62
 *
 * @see <a href="http://pl.spoj.pl/problems/PTROL/">http://pl.spoj.pl/problems/PTROL/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PTROL {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, j, counter = Integer.parseInt(reader.readLine());
        String[] n;

        while (counter-->0) {
            n = reader.readLine().split(" ");
            j = Integer.parseInt(n[0]);
            for (i = 2; i <= j; ++i) {
                System.out.print(n[i] + " ");
            }
            System.out.print(n[1] + "\n");
        }
    }

}
