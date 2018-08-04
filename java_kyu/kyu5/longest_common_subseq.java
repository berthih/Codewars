import java.util.*;

public class Solution {
    public static String sub(String res, String x, String y){
      System.out.println(x + " " + y + " " + res);
      int i = 0;
      int j = 0;
      String subx = x;
      String suby = "";
        for (; i < x.length()  && j < y.length() ; i++){
          if (x.charAt(i) == y.charAt(j))
          {
            res += x.charAt(i);
            subx = x.substring(i, x.length());
            j++;
          }
        }
      if (j + 1 < y.length())
        return sub(res, subx, y.substring(j + 1, y.length()));
      return res;
    }
    public static String lcs(String x, String y) {
        String res = "";
        res = sub(res, x, y);
        return res;
    }
}
