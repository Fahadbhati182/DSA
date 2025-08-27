package Arrays;

public class OneShiftElementInArray {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    int n = arr.length - 1;
    int lastElement = arr[n];
    for (int i = n-1; i > 0; i--) {
      arr[i] = arr[i - 1];
    }
    arr[0] = lastElement;

    for (int val : arr) {
      System.out.println(val);
    }
  }

}