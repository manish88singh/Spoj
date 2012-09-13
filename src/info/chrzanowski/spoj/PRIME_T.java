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
 * Status:      błędna odpowiedź
 * Czas:        4.31
 *
 * @see <a href="http://pl.spoj.pl/problems/PRIME_T/">http://pl.spoj.pl/problems/PRIME_T/</a>
 * @author Jakub Chrzanowski
 */
public class PRIME_T {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long counter = Long.parseLong(reader.readLine());
        Random random = new Random();
        int a, i, value;
        boolean result;

        while (counter-->0) {
            value = Integer.parseInt(reader.readLine());
            result = true;

            if (value > 3) {
                for (i = 0; i < 3; ++i) {
                    a = 2 + random.nextInt(value - 2);
                    if (Math.pow(a, value - 1) % value != 1) {
                        result = false;
                        break;
                    }
                }
            } else if (value < 2) {
                result = false;
            }

            System.out.println(result ? "TAK" : "NIE");
        }
    }

}
