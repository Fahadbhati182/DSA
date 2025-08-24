package Arrays;

public class ReverseArray {
  public static void main(String[] args) {
    int[] arr = { 10, 20, 30, 40, 50, 60 };

    int i = 0, j = arr.length - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }

    for (int val : arr) {
      System.out.print(val + " ");
    }
  }
}
