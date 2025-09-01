package Arrays;

import java.util.ArrayList;
import java.util.List;

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

  public static List<Integer> MooresAlgorithTwo(int[] nums) {
    List<Integer> ans = new ArrayList<>();

    int can1 = 0, can2 = 0, freq1 = 0, freq2 = 0;
    for (int val : nums) {
      if (val == can1) {
        freq1++;
      } else if (val == can2) {
        freq2++;
      } else if (freq1 == 0) {
        can1 = val;
        freq1 = 1;
      } else if (freq2 == 0) {
        can2 = val;
        freq2 = 1;
      } else {
        freq1--;
        freq2--;
      }
    }

    freq1 = 0;
    freq2 = 0;
    for (int val : nums) {
      if (val == can1)
        freq1++;
      else if (val == can2)
        freq2++;
    }

    int n = nums.length;
    if (freq1 > n / 3)
      ans.add(can1);
    if (freq2 > n / 3)
      ans.add(can2);

    return ans;
  }

  public static List<Integer> majorityElementGeneralized(int[] nums, int k) {
    if (k < 2)
      throw new IllegalArgumentException("k must be >= 2");

    int n = nums.length;
    int[] candidates = new int[k - 1];
    int[] counts = new int[k - 1];

    // Phase 1: Find potential candidates
    for (int num : nums) {
      boolean placed = false;

      // If already a candidate, increment
      for (int i = 0; i < k - 1; i++) {
        if (counts[i] > 0 && candidates[i] == num) {
          counts[i]++;
          placed = true;
          break;
        }
      }

      if (placed)
        continue;

      // If empty slot, put candidate
      for (int i = 0; i < k - 1; i++) {
        if (counts[i] == 0) {
          candidates[i] = num;
          counts[i] = 1;
          placed = true;
          break;
        }
      }

      if (placed)
        continue;

      // Otherwise, decrement all counts
      for (int i = 0; i < k - 1; i++) {
        counts[i]--;
      }
    }

    // Phase 2: Verify candidates
    List<Integer> result = new ArrayList<>();
    int[] freq = new int[k - 1];
    for (int num : nums) {
      for (int i = 0; i < k - 1; i++) {
        if (counts[i] > 0 && candidates[i] == num) {
          freq[i]++;
        }
      }
    }

    for (int i = 0; i < k - 1; i++) {
      if (freq[i] > n / k && !result.contains(candidates[i])) {
        result.add(candidates[i]);
      }
    }

    return result;
  }


  
  public static void main(String[] args) {
    int[] arr = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };

    int a = MooresAlgorithm(arr);
    System.out.println("Majority Element is: " + a);

    int[] nums1 = { 1, 2, 3, 1, 2, 1, 1, 3, 3, 3 };
    System.out.println(majorityElementGeneralized(nums1, 3)); // [1, 3]

  }
}
