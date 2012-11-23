package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 609. Pole pewnego koła
 *
 * Kod zadania: ETI06F1
 * Poziom:      łatwy
 * Status:      zaakceptowano, 4
 * Czas:        6.29
 *
 * @see <a href="http://pl.spoj.pl/problems/ETI06F1/">http://pl.spoj.pl/problems/ETI06F1/</a>
 * @author Jakub Chrzanowski
 */
public class ETI06F1 {

    public static final Double PI = 3.141592654;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] values = reader.readLine().split(" ");
        double r = Double.parseDouble(values[0]),
               d = Double.parseDouble(values[1]),
               h = r - 0.5 * d,
               S = PI * (2 * r - h) * h;

        System.out.println((double)Math.round(S * 100) / 100);
    }

}
