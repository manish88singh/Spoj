package info.chrzanowski.spoj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 438. Liczby Pierwsze
 *
 * Kod zadania: PRIME_T
 * Poziom:      łatwy
 * Status:      przekroczono limit czasu
 *
 * @see <a href="http://pl.spoj.pl/problems/PRIME_T/">http://pl.spoj.pl/problems/PRIME_T/</a>
 * @author Jakub Chrzanowski
 */
public class PRIME_T {

    private static final boolean[] primes = new boolean[10000];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long tests = scan.nextLong();

        Arrays.fill(primes, true);
        primes[0] = false;
        for (int i = 2; i < primes.length; ++i) {
            if (primes[i - 1]) {
                for (int j = 2; i * j < primes.length; ++i) {
                    primes[i * j - 1] = false;
                }
            }
        }
        for (long i = 0; i < tests; ++i) {
            int value = scan.nextInt();
            boolean isPrime = primes[value - 1];
            System.out.println(isPrime ? "TAK" : "NIE");
        }

        scan.close();
    }

}
