package Patterns;

public class PyramidPattern {
  public static void main(String[] args) {

    int n = 4;
    for (int i = 0; i < n; i++) {

      // Leading spaces
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      // Left side of pyramid (increasing numbers)
      for (int j = 1; j <= i + 1; j++) {
        System.out.print(j);
      }

      // Right side of pyramid (decreasing numbers)
      for (int j = i; j > 0; j--) {
        System.out.print(j);
      }

      // Trailing spaces (optional,w for symmetry)
      for (int j = 0; j < n - i - 1; j++) {
        System.out.print(" ");
      }

      System.out.println();

    }

  }
}
