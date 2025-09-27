package BinarySearch;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
    int tar = 12;

    int st = 0, end = arr.length - 1;

    while (st < end) {
      int mid = st + (end - st) / 2;

      if (arr[mid] == tar) {
        System.out.println(mid);
        return;
      }

      if (arr[mid] > tar) {
        end = mid - 1;
      } else {
        st = mid + 1;
      }
    }
  }

}