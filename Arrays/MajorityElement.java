package Arrays;

public class MajorityElement {

  public static int MooresAlgorithm(int[] arr) {
    int ans = 0;
    int freq = 0;

    for (int i = 0; i < arr.length; i++) {
      if (freq == 0) {
        ans = arr[i];
      }

      if (ans == arr[i]) {
        freq++;
      } else {
        freq--;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };

    int a = MooresAlgorithm(arr);

    System.out.println("Majority Element is: " + a);

  }
}
