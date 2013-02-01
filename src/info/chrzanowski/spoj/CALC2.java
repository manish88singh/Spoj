package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 998. Kalkulator 2
 *
 * Kod zadania: CALC2
 * Poziom:      łatwy
 * Status:      niedostępne dla JAVA
 * Czas:
 *
 * @see <a href="http://pl.spoj.pl/problems/CALC2/">http://pl.spoj.pl/problems/CALC2/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class CALC2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a, b, stack[] = new int[10];
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
                    line = String.valueOf(stack[a] % stack[b]);
                    break;
                case 42: // *
                    line = String.valueOf(stack[a] * stack[b]);
                    break;
                case 43: // +
                    line = String.valueOf(stack[a] + stack[b]);
                    break;
                case 45: // -
                    line = String.valueOf(stack[a] - stack[b]);
                    break;
                case 47: // /
                    line = String.valueOf(stack[a] / stack[b]);
                    break;
                case 122: // z
                    stack[a] = b;
                    continue;
            }

            System.out.println(line);
        }
    }

}
