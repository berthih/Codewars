import java.util.stream.IntStream;
import java.util.*;

public class Primes {
  public static IntStream stream() {
        int[] arr = IntStream.range(1, 1000000 + 1).toArray();
        int n = 50000000;

        boolean[] isPrime = new boolean[n+1];
        //Arrays.fill(isPrime, Boolean.TRUE);
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }
        for (int factor = 2; factor*factor <= n; factor++) {
            if (isPrime[factor]) {
                for (int j = factor; factor*j <= n; j++) {
                    isPrime[factor*j] = false;
                }
            }
        }
        int primes = 0;
        int[] res = new int[5000000];
        int add = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]){ 
              res[add] = i;
              add++;
              primes++;
            }
        }
        System.out.println("The number of primes <= " + n + " is " + primes);
        return IntStream.of(res);
  }
}
