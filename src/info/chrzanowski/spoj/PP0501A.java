package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 601. NWD
 *
 * Kod zadania: PP0501A
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.63
 *
 * @see <a href="http://pl.spoj.pl/problems/PP0501A/">http://pl.spoj.pl/problems/PP0501A/</a>
 * @author Jakub Chrzanowski
 */
public class PP0501A {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int valueA, valueB, counter = Integer.parseInt(reader.readLine());
        String[] values;

        while (counter-->0) {
            values = reader.readLine().split(" ");
            valueA = Integer.parseInt(values[0]);
            valueB = Integer.parseInt(values[1]);

            System.out.println(String.valueOf(nwd(valueA, valueB)));
        }
    }

    private static int nwd(int a, int b) {
        int sum = a + b;
        if (a == 0 || b == 0) {
            return sum;
        }
        if (b > a) {
            a = b;
            b = sum - b;
        }

        return nwd(b, a % b);
    }

}
