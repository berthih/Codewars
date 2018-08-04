import java.math.BigInteger;
import java.util.*;

public class Fibonacci {
private static Map<BigInteger, BigInteger> memo = new HashMap<>();
  public static BigInteger fib(BigInteger n)
  {
    long n2 = n.longValue();
    int n3 = n.intValue();
    if (n.signum() == 1)
      return fib2(n3);
    else
    {
      if (n2 % 2 != 0)
        return fib2(-n3);
      return fib2(-n3).negate();
    }
  }
  
  private static BigInteger fib2(int n) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		int m = 0;
		for (int i = 31 - Integer.numberOfLeadingZeros(n); i >= 0; i--) {
			BigInteger d = multiply(a, b.shiftLeft(1).subtract(a));
			BigInteger e = multiply(a, a).add(multiply(b, b));
			a = d;
			b = e;
			m *= 2;
			if (((n >>> i) & 1) != 0) {
				BigInteger c = a.add(b);
				a = b;
				b = c;
				m++;
			}
		}
		return a;
	}
  
  private static BigInteger slowFibonacci(int n) {
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			BigInteger c = a.add(b);
			a = b;
			b = c;
		}
		return a;
	}
  
  private static BigInteger multiply(BigInteger x, BigInteger y) {
		return x.multiply(y);
	}
  
}
