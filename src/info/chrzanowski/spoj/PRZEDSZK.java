package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 522. Przedszkolanka
 *
 * Kod zadania: PRZEDSZK
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.31
 *
 * @see <a href="http://pl.spoj.pl/problems/PRZEDSZK/">http://pl.spoj.pl/problems/PRZEDSZK/</a>
 * @author Jakub Chrzanowski
 */
public class PRZEDSZK {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine()),
            a, tmpA, b, tmpB;

        while (c-->0) {
            String[] inputs = reader.readLine().split(" ");
            a = tmpA = Integer.parseInt(inputs[0]);
            b = tmpB = Integer.parseInt(inputs[1]);

            while (tmpA != tmpB) {
                if (tmpA > tmpB) {
                    tmpB += b;
                } else {
                    tmpA += a;
                }
            }

            System.out.println(tmpA);
        }
    }

}