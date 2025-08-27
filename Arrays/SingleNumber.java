package Arrays;

public class SingleNumber {
  public static void main(String[] args) {
    // Given a non-empty array of integers nums, every element appears twice except
    // for one. Find that single one.

    int[] arr = { 1, 1, 2, 2, 5, 3, 3 };

    int ans = 0;
    for (int val : arr) {
      ans ^= val;
    }
    System.out.println(ans);
  }
}
