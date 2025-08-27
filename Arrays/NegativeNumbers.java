package Arrays;

public class NegativeNumbers {
  // Given an array containing both positive and negative numbers in random order.
  // The task is to rearrange the array elements so that all negative numbers
  // appear before all positive numbers.

  public static void main(String[] args) {
    int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };
    int left = 0, right = arr.length - 1;

    while (left < right) {

      while (arr[left] < 0 && left < right) {
        left++;
      }

      while (arr[right] > 0 && left < right) {
        right--;
      }

      if (right > left) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
      }
    }

    for (int val : arr) {
      System.out.println(val);
    }

  }
}
