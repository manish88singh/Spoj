package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1240. Współliniowość punktów
 *
 * Kod zadania: JWSPLIN
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.36
 *
 * @see <a href="http://pl.spoj.pl/problems/JWSPLIN/">http://pl.spoj.pl/problems/JWSPLIN/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class JWSPLIN {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, det,
            counter = Integer.parseInt(reader.readLine()),
            is[]    = new int[6];
        String[] data;

        while (counter-->0) {
            data = reader.readLine().split(" ");
            for (i = 0; i < 6; ++i) {
                is[i] = Integer.parseInt(data[i]);
            }

            det = is[0] * is[3] + is[2] * is[5] + is[1] * is[4] - is[3] * is[4] - is[0] * is[5] - is[1] * is[2];
            System.out.println(det == 0 ? "TAK" : "NIE");
        }
    }

}
