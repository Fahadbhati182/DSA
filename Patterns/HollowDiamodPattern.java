package Patterns;

public class HollowDiamodPattern {
  public static void main(String[] args) {

    int n = 4, m = 3;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }
      System.out.print("*");

      if (i != 0) {
        for (int j = 0; j < 2 * i - 1; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      if (i != m - 1) {
        for (int j = 0; j < 2 * (m - i - 1) - 1; j++) {
          System.out.print(" ");
        }
        System.out.print("*");
      }

      System.out.println();
    }

  }
}
