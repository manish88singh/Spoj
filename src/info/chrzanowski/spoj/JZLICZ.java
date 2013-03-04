package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1242. Zliczacz liter
 *
 * Kod zadania: JZLICZ
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        1.17
 *
 * @see <a href="http://pl.spoj.pl/problems/JZLICZ/">http://pl.spoj.pl/problems/JZLICZ/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class JZLICZ {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, l, map[] = new int[52], counter = Integer.parseInt(reader.readLine());
        String input = "";
        char ch;

        while (counter-->0) {
            input += reader.readLine().replaceAll(" ", "");
        }
        l = input.length();
        for (i = 0; i < l; ++i) {
            ch = input.charAt(i);
            if (ch >= 97) {
                ++map[ch-97];
            } else {
                ++map[ch-39];
            }
        }
        for (i = 0; i < 52; ++i) {
            if (map[i] == 0) {
                continue;
            }
            ch = (char) ((i < 26) ? i + 97 : i + 39);
            System.out.println(ch + " " + map[i]);
        }
    }

}
