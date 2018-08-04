import java.util.Arrays;
import java.lang.*;

public class IntPart {
	static long printArray(long p[], int n)
    {
        long res = 1;
        for (int i = 0; i < n; i++)
            res *= p[i];
        return res;
    }
  static void printArr(long p[], int n)
    {
        System.out.println("start print");
        for (int i = 0; i <= n; i++)
          System.out.println("p[" + i + "] = " + p[i]);
        System.out.println("end print");
    }
  public static double average(long mult[], int size){
    double res = 0;
    for (int i = size; i >= 0; i--)
      res += mult[i];
    return res/size;
  }
   public static double median(long mult[], int size){
    if (size % 2 == 0){
     long m1 = mult[size/2];
     long m2 = mult[(size/2) + 1];
     double res = (m1 + m2);
     return res/2;
    }
    return mult[(size/2) + 1];
  }
  public static boolean search(long mult[], long n, int size){
    for (int i = size; i >= 0; i--){
      if(mult[i] == n)
        return true;
    }
    return false;
  }
  public static String part(long n) {
    long[] p = new long[5000000];
    int k = 0;  
    p[k] = n;  
    long[] mult = new long[500000];
    int m = 0;
    while (true)
     {
            long ml = printArray(p, k + 1);
            if (!search(mult, ml, m)){
              mult[m] = ml;
              m++;
            }
            long rem_val = 0;
            while (k >= 0 && p[k] == 1)
            {
                rem_val += p[k];
                k--;
            }
            if (k < 0)  break;
            p[k]--;
            rem_val++;
            while (rem_val > p[k])
            {
                p[k+1] = p[k];
                rem_val = rem_val - p[k];
                k++;
            }

            p[k+1] = rem_val;
            k++;
            
     }
     int s = m+1;
     long[] res = new long[s];
     System.arraycopy( mult, 0, res, 0, s);
     Arrays.sort(res);
     double avg = average(res, m);
     double avgs = Math.round(avg * 100.0) / 100.0;
     double md = median(res, m);
     long range = res[m] - res[1];
     String text = Double.toString(Math.abs(avgs));
     int inte = text.indexOf('.');
     int dec = text.length() - inte - 1;
     if (dec == 2)
       return "Range: " + range + " Average: " + avgs + " Median: " + md + 0;
     else
       return "Range: " + range + " Average: " + avgs + 0 + " Median: " + md + 0;
  }
}
