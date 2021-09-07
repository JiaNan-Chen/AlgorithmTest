import java.util.Arrays;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author chenjianan
 * @create 2021/7/20
 * @since 1.0.0
 */
public class SortTestEpx3 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 1, 6, 8, 9, 2, 3, 3, 4, 4, 5};
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
//        mergeSort(arr);
//        quickSort(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        for (int index = arr.length - 1; index > 0; index--) {
            buildMaxHeap(arr, index);
            swap(arr, 0, index);
        }
    }

    private static void buildMaxHeap(int[] arr, int end) {
        for (int index = (end - 1) / 2; index >= 0; index--) {
            buildMaxHeapInner(arr, index, end);
        }
    }

    private static void buildMaxHeapInner(int[] arr, int index, int end) {
        int maxIndex = index * 2 + 1;
        if (maxIndex > end) {
            return;
        }
        int maxValue = arr[maxIndex];
        if (index * 2 + 2 <= end) {
            if (maxValue < arr[index * 2 + 2]) {
                maxValue = arr[index * 2 + 2];
                maxIndex = index * 2 + 2;
            }
        }
        if (maxValue > arr[index]) {
            swap(arr, maxIndex, index);
            buildMaxHeapInner(arr, maxIndex, end);
        }
    }

    private static void quickSort(int[] arr) {
        quickSortInner(arr, 0, arr.length - 1);
    }

    private static void quickSortInner(int[] arr, int left, int right) {
        if (left < right) {
            int middle = getPartition(arr, left, right);
            quickSortInner(arr, left, middle - 1);
            quickSortInner(arr, middle + 1, right);
        }
    }

    private static int getPartition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= temp) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] < temp) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = temp;
        return left;
    }

    private static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSortInner(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortInner(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortInner(arr, temp, left, middle);
            mergeSortInner(arr, temp, middle + 1, right);
            mergeTwoPart(arr, temp, left, middle + 1, right);
        }
    }

    private static void mergeTwoPart(int[] arr, int[] temp, int left, int right, int end) {
        int i = left;
        int j = right;
        int k = left;
        while (i < right && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i < right) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        for (int index = left; index <= end; index++) {
            arr[index] = temp[index];
        }
    }

    private static void insertionSort(int[] arr) {
        for (int index = 1; index < arr.length; index++) {
            int temp = arr[index];
            int swapIndex = index;
            for (int right = index - 1; right >= 0; right--) {
                if (arr[right] > temp) {
                    arr[right + 1] = arr[right];
                    swapIndex = right;
                } else {
                    break;
                }
            }
            arr[swapIndex] = temp;
        }
    }

    private static void selectionSort(int[] arr) {
        for (int index = 0; index < arr.length - 1; index++) {
            int minIndex = index;
            int minValue = arr[index];
            for (int left = index + 1; left < arr.length; left++) {
                if (minValue > arr[left]) {
                    minValue = arr[left];
                    minIndex = left;
                }
            }
            swap(arr, index, minIndex);
        }
    }

    private static void bubbleSort(int[] arr) {
        boolean isSwap;
        for (int right = arr.length - 1; right > 0; right--) {
            isSwap = false;
            for (int left = 0; left < right; left++) {
                if (arr[left] > arr[left + 1]) {
                    swap(arr, left, left + 1);
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
