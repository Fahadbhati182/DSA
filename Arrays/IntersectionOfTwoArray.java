package Arrays;

import java.util.ArrayList;

public class IntersectionOfTwoArray {

  public static ArrayList<Integer> Intersection(int[] A, int[] B) {
    ArrayList<Integer> ans = new ArrayList<>();
    int i = 0, j = 0;
    int n = A.length, m = B.length;
    while (i < n && j < m) {
      if (A[i] < B[j]) {
        i++;
      } else if (A[i] > B[j]) {
        j++;
      } else {
        ans.add(A[i]);
        j++;
        i++;
      }

    }
    return ans;

  }

  public static void main(String[] args) {

    int[] A = { 1, 1, 2, 3, 4, 5 };
    int[] B = { 2, 3, 4, 4, 5, 6 };

    ArrayList<Integer> ans = Intersection(A, B);

    for (int val : ans) {
      System.out.println(val);
    }

  }
}
