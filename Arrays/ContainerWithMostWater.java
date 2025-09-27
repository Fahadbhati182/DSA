package Arrays;

public class ContainerWithMostWater {
  public int maxArea(int[] height) {
    int i = 0;
    int j = height.length - 1;
    int max = 0;

    while (i < j) {
      int length = j - i;
      int breadth = Math.min(height[i], height[j]);
      int area = breadth * length;
      max = Math.max(max, area);

      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return max;

  }

  public static void main(String[] args) {

  }
}
