package info.chrzanowski.spoj;

import java.util.Scanner;

/**
 * 769. Zadanie próbne
 *
 * Kod zadania: TRN
 * Poziom:      łatwy
 * Status:      zaakceptowano
 * Czas:        0.86
 *
 * @see <a href="http://pl.spoj.pl/problems/TRN/">http://pl.spoj.pl/problems/TRN/</a>
 * @author Jakub Chrzanowski <jakub@chrzanowski.info>
 */
public class TRN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, m = scanner.nextInt(),
            j, n = scanner.nextInt(),
            mx[] = new int[m*n];

        for (i = 0; i < m; ++i) {
            for (j = 0; j < n; ++j) {
                System.out.println(i*m+j);
                mx[i*m+j] = scanner.nextInt();
            }
        }
        for (j = 0; j < n; ++j) {
            for (i = 0; i < m; ++i) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(mx[i*m+j]);
            }
            System.out.print("\n");
        }
    }

}
