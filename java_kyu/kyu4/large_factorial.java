import java.util.*;
import java.lang.*;
import java.math.*;
public class Kata
{

  public static String Factorial(int n) {
    BigInteger fact = BigInteger.valueOf(1);
    for (int i = 1; i <= n; i++)
        fact = fact.multiply(BigInteger.valueOf(i));
    System.out.println(fact);
    return fact.toString();
  }

}
