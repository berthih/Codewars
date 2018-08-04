import java.util.Arrays;
public class Kata
{
    public static boolean valid(int t[], long m){
      String temp = Long.toString(m);
      int[] num = new int[temp.length()];
      for (int i = 0; i < temp.length(); i++)
      {
        num[i] = temp.charAt(i) - '0';
      }
      Arrays.sort(num);
           
      return Arrays.equals(num, t);
    }
    public static void swap(int ar[], int i, int j) 
    {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }
    public static long nextBiggerNumber(long n)
    {
      String temp = Long.toString(n);
      int[] num = new int[temp.length()];
      boolean done =false;
      for (int i = 0; i < temp.length(); i++)
      {
        num[i] = temp.charAt(i) - '0';
      }
      if (!done){
        int i;
        for (i = num.length - 1; i > 0; i--) 
        {
            if (num[i] > num[i - 1]) {
                break;
            }
        }
        if (i != 0){
        int x = num[i - 1], min = i;
        for (int j = i + 1; j < num.length; j++) 
        {
           if (num[j] > x && num[j] < num[min]) 
           {
              min = j;
           }
        }
        swap(num, i - 1, min);
        Arrays.sort(num, i, num.length);
        }
        else
          return -1;
      }

      StringBuilder strNum = new StringBuilder();
      for (int nu : num) 
      {
           strNum.append(nu);
      }
      long finalInt = Long.parseLong(strNum.toString());
      return finalInt;
    }
}
