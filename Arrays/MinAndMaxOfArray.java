package Arrays;

public class MinAndMaxOfArray {

  public static void main(String[] args) {
    int arr[] = { 22, 14, 8, 17, 35, 3 };

    int largest = arr[0];
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      if (arr[i] > largest) {
        largest = arr[i];
      }
    }

    int smallest = arr[0];
    for (int i = 1; i < n; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }

    System.out.println("largest Element--->" + largest);
    System.out.println("smallest Element--->" + smallest);
  }
}
