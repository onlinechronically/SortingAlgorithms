import java.util.Arrays;
import java.util.stream.IntStream;

class QuickSort {
    public static int[] quickSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        } else {
            int pivot = arr[arr.length - 1];
            int smallerCount = 0;
            int largerCount = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] <= pivot) smallerCount++;
                else if (arr[i] > pivot) largerCount++;
            }
            int[] smaller = new int[smallerCount];
            int[] larger = new int[largerCount];
            smallerCount = 0;
            largerCount = 0;
            for (int i = 0; i < arr.length -1; i++) {
                if (arr[i] <= pivot) smaller[smallerCount++] = arr[i];
                else if (arr[i] > pivot) larger[largerCount++] = arr[i];
            }
            int[] smallerSorted = quickSort(smaller);
            int[] largerSorted = quickSort(larger);
            return IntStream.concat(Arrays.stream(smallerSorted), IntStream.concat(IntStream.of(pivot), Arrays.stream(largerSorted))).toArray();
        }
    }
}