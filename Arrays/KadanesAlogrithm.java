package Arrays;

public class KadanesAlogrithm {
  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    int currSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      currSum = Math.max(arr[i], currSum + arr[i]); // extend or restart
      maxSum = Math.max(maxSum, currSum); // update max
    }

    System.out.println("Maximum sum is ---> " + maxSum);
  }
}
