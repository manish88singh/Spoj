package info.chrzanowski.spoj;

import java.io.IOException;
import java.util.Scanner;

/**
 * 1828. Dodawanie liczb całkowitych
 *
 * Kod zadania: KC001
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.42
 *
 * @see <a href="http://pl.spoj.pl/problems/KC001/">http://pl.spoj.pl/problems/KC001/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class KC001 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int i, result = 0;
        for (i = 0; i < 3; ++i) {
            result += scanner.nextInt();
        }
        System.out.println(result);
    }

}
