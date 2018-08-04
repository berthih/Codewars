import java.math.BigInteger;
import java.util.PriorityQueue;

public class Hamming {
 
  private static void updateFrontier(BigInteger x, PriorityQueue<BigInteger> pq) {
        pq.offer(x.shiftLeft(1));
        pq.offer(x.multiply(BigInteger.valueOf(3)));
        pq.offer(x.multiply(BigInteger.valueOf(5)));
    }
	public static long hamming(int n) {
        PriorityQueue<BigInteger> frontier = new PriorityQueue<>();
        updateFrontier(BigInteger.ONE, frontier);
        BigInteger lowest = BigInteger.ONE;
        for (int i = 1; i < n; i++) {
            lowest = frontier.poll();
            while (frontier.peek().equals(lowest))
                frontier.poll();
            updateFrontier(lowest, frontier);
        }
        return lowest.longValue();
  }
  
}
