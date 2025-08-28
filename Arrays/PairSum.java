package Arrays;

public class PairSum {
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 6 };
    int target = 6;

    int i = 0, j = nums.length - 1;
    while (i < j) {
      int PairSum = nums[i] + nums[j];
      if (PairSum > target) {
        j--;
      } else if (PairSum < target) {
        i++;
      } else {
        System.out.println("Pair found: " + nums[i] + " + " + nums[j]);
      }
    }
  }
}
