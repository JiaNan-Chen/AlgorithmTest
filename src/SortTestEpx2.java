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
public class SortTestEpx2 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 2, 1, 6, 8, 9, 2, 3, 3, 4, 4, 5};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        mergeSort(arr);
        quickSort(arr);
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
        while (true){
            System.out.println(new Random().nextInt(1));
        }
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
        int left = 2 * index + 1;
        if (left > end) {
            return;
        }
        int maxChild = arr[left];
        int maxChildIndex = left;
        if (left + 1 <= end) {
            if (arr[left + 1] > maxChild) {
                maxChild = arr[left + 1];
                maxChildIndex = left + 1;
            }
        }
        if (maxChild > arr[index]) {
            swap(arr, index, maxChildIndex);
            buildMaxHeapInner(arr, maxChildIndex, end);
        }
    }


    private static void quickSort(int[] arr) {
        quickSortInner(arr, 0, arr.length - 1);
    }

    private static void quickSortInner(int[] arr, int left, int right) {
        if (left < right) {
            int partition = getPartition(arr, left, right);
            quickSortInner(arr, left, partition - 1);
            quickSortInner(arr, partition + 1, right);
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
            if (middle - 1 < right) {
                mergeSortInner(arr, temp, left, middle - 1);
            }
            if (middle > left) {
                mergeSortInner(arr, temp, middle, right);
            }
            mergeTwoPart(arr, temp, left, middle, right);
        }
    }

    private static void mergeTwoPart(int[] arr, int[] temp, int left, int middle, int right) {
        int l = left;
        int r = middle;
        int k = left;
        while (l <= middle - 1 && r <= right) {
            if (arr[l] <= arr[r]) {
                temp[k++] = arr[l++];
            } else {
                temp[k++] = arr[r++];
            }
        }
        while (l <= middle - 1) {
            temp[k++] = arr[l++];
        }
        while (r <= right) {
            temp[k++] = arr[r++];
        }
        for (int index = left; index <= right; index++) {
            arr[index] = temp[index];
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int temp = arr[i];
            int swapIndex = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    swapIndex = j;
                    swap(arr, j, j + 1);
                } else {
                    break;
                }
            }
            arr[swapIndex] = temp;
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            swap(arr, maxIndex, i);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
