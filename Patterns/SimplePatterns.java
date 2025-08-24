package Patterns;

public class SimplePatterns {

  public static void main(String[] args) {

    for (int i = 0; i < 4; i++) {
      int num = 1;
      for (int j = 0; j < 4; j++) {
        System.out.print(num);
        num++;
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");

    char chars = 'A';
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.print(chars);
        chars++;
      }
      System.out.println("");
    }

  }

}