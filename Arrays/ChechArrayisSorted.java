package Arrays;

import java.util.Scanner;

public class ChechArrayisSorted {
  public static void main(String[] args) {
    int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Type(asc/desc)---> ");
    System.out.print("ASC(0) and DESC(1) : ");
    int type = input.nextInt();

    if (type != 0 && type != 1) {
      System.out.println("Invalid type ");
      return;
    }

    boolean sorted = true;
    if (type == 0) { // ascending check
      for (int i = 1; i < arr1.length; i++) {
        if (arr1[i] < arr1[i - 1]) {
          sorted = false;
          break;
        }
      }
      if (sorted) {
        System.out.println("Array is sorted in ascending order");
      } else {
        System.out.println("Array is NOT sorted in ascending order");
      }
    } else { // descending check
      for (int i = 1; i < arr1.length; i++) {
        if (arr1[i] > arr1[i - 1]) {
          sorted = false;
          break;
        }
      }
      if (sorted) {
        System.out.println("Array is sorted in descending order");
      } else {
        System.out.println("Array is NOT sorted in descending order");
      }
    }

  }
}
