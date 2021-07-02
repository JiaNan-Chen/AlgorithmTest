import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author chenjianan
 * @create 2021/6/30
 * @since 1.0.0
 */
public class SortPre {
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

    /**
     * 冒泡
     *
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean isSwap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

    /**
     * 选择
     *
     * @param arr
     */
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    //插入排序
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int cur = arr[i];
            int j = i;
            while (j > 0 && cur < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = cur;
        }
    }

    //归并排序
    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        mergeSortInner(arr, temp, 0, arr.length - 1);
    }

    private static void mergeSortInner(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSortInner(arr, temp, left, middle);
            mergeSortInner(arr, temp, middle + 1, right);
            sortTwoPart(arr, temp, left, middle + 1, right);
        }
    }

    private static void sortTwoPart(int[] arr, int[] temp, int left, int right, int end) {
        int i = left;
        int j = right;
        int k = left;
        while (i < right && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else if (arr[i] > arr[j]) {
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

    public static void quickSort(int[] arr) {
        quickSortInner(arr, 0, arr.length - 1);
    }

    private static void quickSortInner(int[] arr, int left, int right) {
        if (left < right) {
            int index = getPartition(arr, left, right);
            quickSortInner(arr, left, index - 1);
            quickSortInner(arr, index + 1, right);
        }
    }

    private static int getPartition(int[] arr, int left, int right) {
        int p = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= p) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= p) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = p;
        return left;
    }

    public static void heapSort(int[] arr) {
        for (int index = arr.length - 1; index >= 0; index--) {
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
        int swapIndex = 2 * index + 1;
        if (swapIndex > end) {
            return;
        }
        int maxChild = arr[swapIndex];
        if (2 * index + 2 < end) {
            int right = arr[2 * index + 2];
            if (right > maxChild) {
                swapIndex = 2 * index + 2;
                maxChild = right;
            }
        }
        if (maxChild > arr[index]) {
            swap(arr, index, swapIndex);
            buildMaxHeapInner(arr, swapIndex, end);
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
    }

}
