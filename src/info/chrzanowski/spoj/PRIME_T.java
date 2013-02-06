package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * 438. Liczby Pierwsze
 *
 * Kod zadania: PRIME_T
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        4.48
 *
 * @see <a href="http://pl.spoj.pl/problems/PRIME_T/">http://pl.spoj.pl/problems/PRIME_T/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PRIME_T {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long counter = Long.parseLong(reader.readLine());
        Random random = new Random();
        int value, p, s;
        boolean result;

        while (counter-->0) {
            value  = Integer.parseInt(reader.readLine());
            result = value > 1;
            s      = (int) Math.sqrt(value);
            p      = 2;



            while (value != p && p <= s) {
                if (value % p++ == 0) {
                    result = false;
                    break;
                }
            }

            System.out.println(result ? "TAK" : "NIE");
        }
    }

}
