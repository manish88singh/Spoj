package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1011. Połowa
 *
 * Kod zadania: POL
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.96
 *
 * @see <a href="http://pl.spoj.pl/problems/POL/">http://pl.spoj.pl/problems/POL/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class POL {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = Integer.parseInt(reader.readLine());
        String input;

        while (counter-->0) {
            input = reader.readLine();
            System.out.println(input.substring(0, input.length()/2));
        }
    }

}
