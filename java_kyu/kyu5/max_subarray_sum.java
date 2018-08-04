public class Max {
  public static int sequence(int[] arr) {
    int max_so_far = 0;
    int max_ending_here = 0;
    for (int num : arr) {
        max_ending_here = Math.max(0, max_ending_here + num);
        max_so_far = Math.max(max_so_far, max_ending_here);
    }
    return max_so_far;
  }
}
