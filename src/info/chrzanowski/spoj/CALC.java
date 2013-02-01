package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 997. Kalkulator
 *
 * Kod zadania: CALC
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.30
 *
 * @see <a href="http://pl.spoj.pl/problems/CALC/">http://pl.spoj.pl/problems/CALC/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class CALC {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b;
        String line, data[];

        while ((line = reader.readLine()) != null) {
            if (line.equals("")) {
                break;
            }
            data = line.split(" ");
            a    = Integer.parseInt(data[1]);
            b    = Integer.parseInt(data[2]);

            switch (data[0].charAt(0)) {
                case 37: // %
                    line = String.valueOf(a % b);
                    break;
                case 42: // *
                    line = String.valueOf(a * b);
                    break;
                case 43: // +
                    line = String.valueOf(a + b);
                    break;
                case 45: // -
                    line = String.valueOf(a - b);
                    break;
                case 47: // /
                    line = String.valueOf(a / b);
                    break;
            }

            System.out.println(line);
        }
    }

}
