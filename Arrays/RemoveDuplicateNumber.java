package Arrays;

public class RemoveDuplicateNumber {
  public static void main(String[] args) {
    // Given an integer array nums sorted in non-decreasing order, remove the
    // duplicates in-place such that each unique element appears only once. The
    // relative order of the elements should be kept the same. Then return the
    // number of unique elements in nums

    int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

    int n = arr.length;
    int j = 0;

    for (int i = 1; i < n; i++) {
      if (arr[i] != arr[j]) {
        arr[++j] = arr[i];
      }
    }

    System.out.println(j + 1);

  }
}
