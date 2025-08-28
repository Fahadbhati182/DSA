package Arrays;

public class SecondLargestElement {
  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 4, 8, 9, 20, 5 };

    int n = numbers.length;
    int larg = numbers[0];
    int sec = -1;

    for (int i = 0; i < n; i++) {
      if (larg < numbers[i]) {
        sec = larg;
        larg = numbers[i];
      } else if (larg > numbers[i] && sec < numbers[i]) {
        sec = numbers[i];
      }
    }

    System.out.println("Second largest Element--->" + sec);
    System.out.println("Largest Element --->" + larg);
  }
}
