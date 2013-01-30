package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 499. Czy umiesz potęgować
 *
 * Kod zadania: PA05_POT
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.29
 *
 * @see <a href="http://pl.spoj.pl/problems/PA05_POT/">http://pl.spoj.pl/problems/PA05_POT/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PA05_POT {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        long valueA, valueB;
        int counter = Integer.parseInt(reader.readLine());
        String[] values;

        while (counter-->0) {
            values = reader.readLine().split(" ");
            valueA = Integer.parseInt(values[0]);
            valueB = Integer.parseInt(values[1]);

            System.out.println(pow(valueA, valueB));
        }
    }

    private static int pow(long a, long b) {
        int res = (int) (a % 10),
            pow = (int) ((b - 1) % 4);

        switch (res) {

            case 1:
            case 5:
            case 6:
            case 0:
                break;

            case 2:
                res = new int[]{2,4,8,6}[pow];
                break;
            case 3:
                res = new int[]{3,9,7,1}[pow];
                break;
            case 4:
                res = new int[]{4,6,4,6}[pow];
                break;
            case 7:
                res = new int[]{7,9,3,1}[pow];
                break;
            case 8:
                res = new int[]{8,4,2,6}[pow];
                break;
            case 9:
                res = new int[]{9,1,9,1}[pow];
                break;

        }

        return res;
    }

}
