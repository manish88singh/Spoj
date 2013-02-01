package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 978. Stos
 *
 * Kod zadania: STOS
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.23
 *
 * @see <a href="http://pl.spoj.pl/problems/STOS/">http://pl.spoj.pl/problems/STOS/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class STOS {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n, i = 0, stack[] = new int[10];
        String sign;

        while ((sign = reader.readLine()) != null) {

            if (sign.equals("-")) {
                if (--i < 0) {
                    i = 0;
                    System.out.println(":(");
                } else {
                    System.out.println(String.valueOf(stack[i]));
                }
            } else if (sign.equals("+")) {
                n = Integer.valueOf(reader.readLine());
                if (i == 10) {
                    System.out.println(":(");
                } else {
                    System.out.println(":)");
                    stack[i++] = n;
                }
            } else {
                break;
            }

        }
    }

}
