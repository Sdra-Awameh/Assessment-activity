import java.util.*;

/**
 * This class is created to show how two sorting algorithms work:
 * Quick Sort (for Integer arrays) and Merge Sort (for int arrays).
 * It sorts two arrays and prints them after sorting.
 * 
 * @author Sidra
 * @version 1.0
 */
public class SortExample {

    /**
     * This is the main method that runs first.
     * It creates two arrays and sorts them using Quick Sort and Merge Sort.
     *
     * @param args command line arguments (not used here)
     */
    public static void main(String[] args) {
        // Unsorted Integer array for quick sort
        Integer[] array1 = new Integer[] { 12, 13, 24, 10, 3, 6, 90, 70 };
        // Unsorted int array for merge sort
        int array2[] = { 2, 6, 3, 5, 1 };

        // Sorting the first array using quick sort
        quickSort(array1, 0, array1.length - 1);
        System.out.println(Arrays.toString(array1));

        // Sorting the second array using merge sort
        mergeSort(array2, array2.length);
        System.out.println(Arrays.toString(array2));
    }

    /**
     * This method uses the Quick Sort algorithm to sort an array.
     * It picks a pivot and recursively sorts the elements around it.
     * 
     * @param arr the array to be sorted
     * @param low the starting index
     * @param high the ending index
     */
    public static void quickSort(Integer[] arr, int low, int high) {
        if (arr == null || arr.length == 0) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;

            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        if (low < j) quickSort(arr, low, j);
        if (high > i) quickSort(arr, i, high);
    }

    /**
     * Swaps two elements in an array.
     * I used this in Quick Sort to change positions of elements.
     * 
     * @param array the array to swap values in
     * @param x index of first element
     * @param y index of second element
     */
    public static void swap(Integer[] array, int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    /**
     * This method is the starting point for Merge Sort.
     * It divides the array into halves and calls merge() to combine them.
     * 
     * @param a the array to sort
     * @param n the length of the array
     */
    public static void mergeSort(int[] a, int n) {
        if (n < 2) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) l[i] = a[i];
        for (int i = mid; i < n; i++) r[i - mid] = a[i];

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    /**
     * This method merges two sorted arrays into one.
     * It's part of the Merge Sort process.
     * 
     * @param a the original array
     * @param l the left half
     * @param r the right half
     * @param left size of left half
     * @param right size of right half
     */
    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }

        while (i < left) a[k++] = l[i++];
        while (j < right) a[k++] = r[j++];
    }

    /**
     * This is just a helper method to check if an array is sorted.
     * I added it for testing purposes.
     * 
     * @param x the array to check
     * @return true if sorted, otherwise false
     */
    private static boolean isSorted(int[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] > x[i + 1]) return false;
        }
        return true;
    }
}
