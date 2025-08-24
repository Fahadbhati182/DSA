package Patterns;

public class TrianglePatterns {

  public void NormalPatterns(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }

    System.out.println("");

    int dig = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(dig + " ");
      }
      dig++;
      System.out.println("");
    }
    System.out.println("");

    char apl = 'A';
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(apl + " ");
      }
      apl++;
      System.out.println("");
    }

    System.out.println("");

    for (int i = 0; i < 4; i++) {
      int digs = 1;
      for (int j = 0; j < i + 1; j++) {
        System.out.print(digs + " ");
        dig++;
      }
      System.out.println("");
    }
  }

  public static void ReverseTrianglePattern(int n) {

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }

  }

  public static void FloyedTriangle(int n) {
    int dig = 1;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print(dig + " ");
        dig++;
      }
      System.out.println("");
    }

  }

  public static void InvertedTraingle(int n) {

    int num = 1;
    for (int i = 0; i < n; i++) {
      // Print leading spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // Print numbers in decreasing width
      for (int j = 1; j <= n - i; j++) {
        System.out.print(num);
      }
      // Move to next line
      System.out.println();
      num++;
    }

  }

  
  public static void main(String[] args) {
    InvertedTraingle(4);
  }

}