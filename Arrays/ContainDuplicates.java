package Arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicates {
  public static boolean containsDuplicate(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int val : nums) {
      if (map.containsKey(val)) {
        return true;
      }
      map.put(val, 1);
    }

    return false;
  }

  public static boolean containsDuplicateTwo(int[] nums, int k) {
    // Given an integer array nums and an integer k, return true if there are two
    // distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
    // - j) <= k.

    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      if (map.containsKey(nums[i])) {
        int prevIdx = map.get(nums[i]);
        return Math.abs(prevIdx - i) <= k;
      }
      map.put(nums[i], i);
    }
    return false;

  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };
    boolean isContainDuplicate = containsDuplicate(nums);
    boolean isContainDuplicateTwo = containsDuplicateTwo(nums, 3);
    System.out.println(isContainDuplicateTwo);
  }
}
