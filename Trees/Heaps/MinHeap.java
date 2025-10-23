package Heaps;

import java.util.Arrays;

public class MinHeap {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        int n = arr.length;

        buildMinHeap(arr, n);

        System.out.println("Min Heap array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void buildMinHeap(int[] arr, int n) {
        for (int i = (n / 2) - 1; i >= n; i--) {
            heapifyMinHeap(arr, n, i);
        }
    }

    private static void heapifyMinHeap(int[] arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] < arr[smallest]) {
            smallest = left;
        }

        if (right < n && arr[right] < arr[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;


            heapifyMinHeap(arr, n, smallest);
        }
    }

    private static int[] insertElement(int[] heap, int newValue, int heapSize) {
        heapSize++;
        heap = Arrays.copyOf(heap, heapSize);

        int i = heapSize - 1;
        heap[i] = newValue;

        //"heapify up"
        while (i != 0) {
            int parent = (i - 1) / 2;
            if (heap[parent] > heap[i]) {
                int temp = heap[parent];
                heap[parent] = heap[i];
                heap[i] = temp;

                i = parent;
            } else {
                break;
            }
        }
        return heap;

    }

    private static int[] deleteElement(int[] heap, int heapSize) {
        if (heapSize <= 0) {
            System.out.println("Heap is Empty");
            return null;
        }

        int lastElement = heap[heapSize - 1];
        heap[0] = lastElement;

        heapifyMinHeap(heap, heapSize, 0);

        heapSize--;
        heap = Arrays.copyOf(heap, heapSize);

        return heap;


    }
}
