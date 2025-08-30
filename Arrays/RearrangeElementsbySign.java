package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeElementsbySign {

  public static void rearrangeArray(ArrayList<Integer> arr) {
    int n = arr.size();

    ArrayList<Integer> pos = new ArrayList<>();
    ArrayList<Integer> neg = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      if (arr.get(i) >= 0) {
        pos.add(arr.get(i));
      } else {
        neg.add(arr.get(i));
      }
    }

    int posIdx = 0, negIdx = 0;
    int i = 0;

    while (posIdx < pos.size() && negIdx < neg.size()) {
      if (i % 2 == 0) {
        arr.set(i++, pos.get(posIdx++));
      } else {
        arr.set(i++, neg.get(negIdx++));

      }
    }

    while (posIdx < pos.size()) {
      arr.set(i++, pos.get(posIdx++));
    }

    while (negIdx < neg.size()) {
      arr.set(i++, neg.get(negIdx++));
    }

    for (int val : arr) {
      System.out.print(val + " ");
    }
  }

  public static void main(String[] args) {
    // Input: arr[] = [1, 2, 3, -4, -1, 4]
    // Output: arr[] = [1, -4, 2, -1, 3, 4]

    ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, -4, -1, 4));

    rearrangeArray(arr);

  }
}
