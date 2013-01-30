package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. Life, the Universe, and Everything
 *
 * Kod zadania: TEST
 * Poziom:      classical
 * Status:      accepted
 * Czas:        0.28
 *
 * @see <a href="http://www.spoj.pl/problems/TEST/">http://www.spoj.pl/problems/TEST/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class TEST {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = reader.readLine()).equals("42")) {
            System.out.println(input);
        }
    }

}
