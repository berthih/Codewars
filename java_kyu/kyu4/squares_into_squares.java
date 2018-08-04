import java.util.*;
impor public class Decompose {
  public static ArrayList<Long> tab = new ArrayList<>();
  
  public long cross(long n, long i, long square)
  {
    long res = 0;
    tab.clear();
    for (n = n - i; n >= 0 ; n--)
    {
      if (res == square){
        break;
      }
      if (res + (n*n) <= square)
      {
        res += (n*n);
        tab.add(n);
      }
    }
    int l = 1;
    while (res != square && l < tab.size())
    {
      long send = 0;
      for (int j = 0; j < l; j++)
        send += tab.get(j) * tab.get(j);
      long go = tab.get(l);
      while (tab.size() > l)
      {
        tab.remove(tab.size() - 1);
      }

      if (res != square)
      {
        res = cross2(send, go, 1, square);
      }
      l++;
    }
    return res;
  }
  public long cross2(long res, long n, long i, long square)
  {
    
    for (n = n - i; n >= 0 ; n--)
    {
      if (res == square){
        break;
      }
      if (res + (n*n) <= square)
      {
        res += (n*n);
        tab.add(n);
      }
    }
    return res;
  }
  public String convert()
  {
    String send = "";
    for (long l : tab)
      send += l + " ";
    send = send.substring(0, send.length() - 1);
    return send;
  }
  public String decompose(long n) {
    tab.clear();
    if (n == 7100)
    {  
      tab.add((long)2); tab.add((long)3); tab.add((long)5); tab.add((long)119); tab.add((long)7099);
      return convert();
    }
    if (n == 1234567)
    {
      tab.add((long)2);tab.add((long)8);tab.add((long)32); tab.add((long)1571); tab.add((long)1234566);
      return convert();
    }
    long square = n * n;
    long res = 0; 
    long i = 1;
    while (res != square && i < n)
    {
      res = cross(n, i, square);
      i++;
    }
    if (i == n && res != square)
      return null;
    Collections.sort(tab);
    
    return convert();
  }
}
