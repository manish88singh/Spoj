package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 506. Flamaster
 *
 * Kod zadania: FLAMASTE
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.31
 *
 * @see <a href="http://pl.spoj.pl/problems/FLAMASTE/">http://pl.spoj.pl/problems/FLAMASTE/</a>
 * @author Jakub Chrzanowski
 */
public class FLAMASTE {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long counter = Long.parseLong(reader.readLine());
        int i, l;
        char prev, curr = ' ';
        String value, output;

        while (counter-->0) {
            value  = reader.readLine();
            output = "";

            if (value.length() == 1) {
                curr = value.charAt(0);
            }
            for (i = l = 1; i < value.length(); ++i) {
                prev = value.charAt(i-1);
                curr = value.charAt(i);

                if (prev == curr) {
                    ++l;
                } else {
                    output += build(String.valueOf(prev), l);
                    l = 1;
                }
            }
            output += build(String.valueOf(curr), l);

            System.out.println(output);
        }
    }

    private static String build(String prev, int l) {
        if (l == 1) {
            return prev;
        } else if (l == 2) {
            return prev + prev;
        } else {
            return prev + String.valueOf(l);
        }
    }

}
