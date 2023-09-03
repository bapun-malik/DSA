import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 1, -3, 0, 6, -7, -1, -4};
        quickSort(arr);
    }

    public static void quickSort(int[] arr) {
        shuffleArray(arr); // Shuffle the array before sorting
        System.out.println("After Shuffling....");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting...");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int partitionIndex = partition(arr, low, high);
        quickSort(arr, low, partitionIndex - 1);  // Sort the left subarray
        quickSort(arr, partitionIndex + 1, high); // Sort the right subarray
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // Choose the first element as the pivot
        int i = low + 1;
        int j = high;

        while (true) {
            while (i <= j && arr[i] < pivot){
                i++;
            }
            while (j >= i && arr[j] > pivot) {
                j--;
            }
            if (i >= j) break;
            swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void shuffleArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rand = (int) (Math.random() * arr.length);
            swap(arr, i, rand);
        }
    }
}

