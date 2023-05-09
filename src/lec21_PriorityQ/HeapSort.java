package lec21_PriorityQ;

import java.util.Arrays;

public class HeapSort {
    public static void insertInVirtualHeap(int[] input, int index) {

        int childIndex = index;
        int parentIndex = ( childIndex - 1 ) / 2;
        while (childIndex > 0) {
            if (input[childIndex] < input[parentIndex]) {
                int temp = input[childIndex];
                input[childIndex] = input[parentIndex];
                input[parentIndex] = temp;
                childIndex = parentIndex;
                parentIndex = ( childIndex - 1 ) / 2;
            } else {
                return;
            }
        }
    }

    private static int removeFromVirtualHeap(int[] input, int size) {
        int temp = input[0];
        input[0] = input[size - 1];
        size--;
        if (size > 1) {
            downHeapify(input, size, 0);
        }
        return temp;
    }

    private static void downHeapify(int[] input, int size, int index) {
        int leftChildIndex = 2 * index + 1;
        int rightChildIndex = 2 * index + 2;
        if (leftChildIndex > size - 1) {
            return;
        }
        int minIndex = index;
        if (input[leftChildIndex] < input[minIndex]) {
            minIndex = leftChildIndex;
        }
        if (rightChildIndex < size && input[rightChildIndex] < input[minIndex]) {
            minIndex = rightChildIndex;
        }
        if (minIndex != index) {
            int temp = input[minIndex];
            input[minIndex] = input[index];
            input[index] = temp;
            downHeapify(input, size, minIndex);
        }
    }

    public static void main(String[] args) {

        int[] input = {6, 4, 7, 5, 3};
        for (int i = 0; i < input.length; i++) {
            insertInVirtualHeap(input, i);
        }
        System.out.println("Heap\t" + Arrays.toString(input));

        for (int i = 0; i < input.length; i++) {
            input[input.length - i - 1] = removeFromVirtualHeap(input, input.length - i);

        }
        System.out.println("Sorted\t" + Arrays.toString(input));

    }
}
