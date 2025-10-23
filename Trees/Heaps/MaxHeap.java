package Heaps;

import java.util.Arrays;

public class MaxHeap {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
        int n = arr.length;

        buildMaxHeap(arr, n);

        System.out.println("Max Heap array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void buildMaxHeap(int[] arr, int n) {
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }


        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
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
            if (heap[parent] < heap[i]) {
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

    static void heapSort(int[] arr) {
        int n = arr.length;

        for (int i = (n / 2) - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    private static int[] deleteElement(int[] heap, int heapSize) {
        if (heapSize <= 0) {
            System.out.println("Heap is Empty");
            return null;
        }

        int lastElement = heap[heapSize - 1];
        heap[0] = lastElement;

        heapify(heap, heapSize, 0);

        heapSize--;
        heap = Arrays.copyOf(heap, heapSize);

        return heap;


    }
}
