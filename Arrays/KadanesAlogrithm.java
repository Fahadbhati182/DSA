package Arrays;

public class KadanesAlogrithm {

  public static int maxProduct(int[] nums) {
    int maxProd = nums[0];
    int currMax = nums[0];
    int currMin = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int x = nums[i];

      // Save before overwriting
      int prevMax = currMax;
      int prevMin = currMin;

      // Either start fresh at x, or extend previous max/min by x
      currMax = Math.max(x, Math.max(prevMax * x, prevMin * x));
      currMin = Math.min(x, Math.min(prevMax * x, prevMin * x));

      // Update global answer
      maxProd = Math.max(maxProd, currMax);
    }
    return maxProd;
  }

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
