package info.chrzanowski.spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 723. ROL
 *
 * Kod zadania: PTEST
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.86
 *
 * @see <a href="http://pl.spoj.pl/problems/PTEST/">http://pl.spoj.pl/problems/PTEST/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PTEST {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()),
            b = Integer.parseInt(reader.readLine());

        System.out.println(String.valueOf(a + b));
    }

}
