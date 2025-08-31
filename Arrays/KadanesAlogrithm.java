package Arrays;

public class KadanesAlogrithm {

  // Start with 53. Maximum Subarray (Kadane’s basics)
  // Do 121. Best Time to Buy and Sell Stock (Kadane’s idea in disguise)
  // Do 152. Maximum Product Subarray  (extension of Kadane’s)
  // Do 918. Maximum Sum Circular Subarray (Kadane’s with circular twist)

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

  public static int maxSubarraySumCircular(int[] nums) {
    // max circular sum=total sum --- min subarray sum
    int total = nums[0];
    int currMax = nums[0], maxSum = nums[0];
    int currMin = nums[0], minSum = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int x = nums[i];
      total += x;

      currMax = Math.max(x, currMax + x);
      maxSum = Math.max(maxSum, currMax);

      currMin = Math.min(x, currMin + x);
      minSum = Math.min(minSum, currMin);
    }

    // Case 1: All numbers are negative → maxSum is the answer
    if (maxSum < 0)
      return maxSum;

    // Case 2: Either normal max OR wrapping max
    return Math.max(maxSum, total - minSum);

  }

  public static int maxSubArraySum(int[] arr) {
    int currSum = arr[0];
    int maxSum = arr[0];

    for (int i = 1; i < arr.length; i++) {
      currSum = Math.max(arr[i], currSum + arr[i]); // extend or restart
      maxSum = Math.max(maxSum, currSum); // update max
    }

    System.out.println("Maximum sum is ---> " + maxSum);
    return maxSum;
  }


  public static void main(String[] args) {
    int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

    int a = maxProduct(arr);
    int b = maxSubArraySum(arr);
    int c = maxSubarraySumCircular(arr);

    System.out.println("Maximum product is ---> " + a);
    System.out.println("Maximum subarray sum is ---> " + b);
    System.out.println("Maximum circular subarray sum is ---> " + c);
  }
} 
