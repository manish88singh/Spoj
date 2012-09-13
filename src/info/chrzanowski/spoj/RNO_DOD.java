package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 549. Proste dodawanie
 *
 * Kod zadania: RNO_DOD
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.31
 *
 * @see <a href="http://pl.spoj.pl/problems/RNO_DOD/">http://pl.spoj.pl/problems/RNO_DOD/</a>
 * @author Jakub Chrzanowski
 */
public class RNO_DOD {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int amount, result, counter = Integer.parseInt(reader.readLine());
        String[] values;

        while (counter-->0) {
            amount = Integer.parseInt(reader.readLine());
            values = reader.readLine().split(" ");
            result = 0;

            while (amount-->0) {
                result += Integer.parseInt(values[amount]);
            }

            System.out.println(result);
        }

    }

}
