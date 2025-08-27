package Arrays;

import java.util.ArrayList;

public class UnionsOfTwoArray {

  public static ArrayList<Integer> Unions(int[] A, int[] B) {
    ArrayList<Integer> ans = new ArrayList<>();

    int i = 0, j = 0;
    int n = A.length, m = B.length;

    while (i < n && j < m) {
      if (A[i] <= B[j]) {
        if (ans.isEmpty() || ans.get(ans.size() - 1) != A[i]) {
          ans.add(A[i]);
        }
        i++;
      } else {
        if (ans.isEmpty() || ans.get(ans.size() - 1) != B[j]) {
          ans.add(B[j]);
        }
        j++;
      }
    }

    while (i < n) {
      if (ans.isEmpty() || ans.get(ans.size() - 1) != A[i]) {
        ans.add(A[i]);
      }
      i++;
    }

    while (j < m) {
      if (ans.isEmpty() || ans.get(ans.size() - 1) != B[j]) {
        ans.add(B[j]);
      }
      j++;
    }

    return ans;
  }

  public static void main(String[] args) {

    int[] A = { 1, 1, 2, 3, 4, 5 };
    int[] B = { 2, 3, 4, 4, 5, 6 };

    ArrayList<Integer> ans = Unions(A, B);

    for (int val : ans) {
      System.out.println(val);
    }

  }

}
