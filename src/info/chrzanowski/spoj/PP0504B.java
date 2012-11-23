package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 617. StringMerge
 *
 * Kod zadania: PP0504B
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.90
 *
 * @see <a href="http://pl.spoj.pl/problems/PP0504B/">http://pl.spoj.pl/problems/PP0504B/</a>
 * @author Jakub Chrzanowski
 */
public class PP0504B {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i, j, counter = Integer.parseInt(reader.readLine());
        String[] values;
        String output;

        while (counter-->0) {
            values = reader.readLine().split(" ");
            output = "";

            j = values[0].length() <= values[1].length() ? values[0].length() : values[1].length();
            for (i = 0; i < j; ++i) {
                output += values[0].charAt(i) + "" + values[1].charAt(i);
            }

            System.out.println(output.trim());
        }
    }

}
