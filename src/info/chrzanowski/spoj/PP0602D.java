package info.chrzanowski.spoj;

import java.io.IOException;
import java.util.Scanner;

/**
 * 1240. Współliniowość punktów
 *
 * Kod zadania: PP0602D
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.43
 *
 * @see <a href="http://pl.spoj.pl/problems/PP0602D/">http://pl.spoj.pl/problems/PP0602D/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class PP0602D {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i,
            n = scanner.nextInt(),
            k = scanner.nextInt();
        String suffix = "", prefix = "";

        if (k < 0) {
            k += n;
        }

        for (i = 0; i < n; ++i) {
            if (i < k) {
                suffix += scanner.nextInt() + " ";
            } else {
                prefix += scanner.nextInt() + " ";
            }
        }

        System.out.println(prefix + suffix.trim());
    }

}
