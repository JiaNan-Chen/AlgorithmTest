import java.util.Arrays;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author chenjianan
 * @create 2021/7/20
 * @since 1.0.0
 */
public class SortTestEpx {
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

    private static void buildMaxHeap(int[] arr, int right) {
        for (int index = (right - 1) / 2; index >= 0; index--) {
            buildMaxHeapInner(arr, index, right);
        }
    }

    private static void buildMaxHeapInner(int[] arr, int index, int right) {
        int maxChildIndex = index * 2 + 1;
        if (maxChildIndex <= right) {
            int maxChildValue = arr[maxChildIndex];
            if (index * 2 + 2 <= right) {
                int temp = arr[maxChildIndex + 1];
                if (temp > maxChildValue) {
                    maxChildValue = temp;
                    maxChildIndex++;
                }
            }
            if (maxChildValue > arr[index]) {
                swap(arr, maxChildIndex, index);
                buildMaxHeapInner(arr, maxChildIndex, index);
            }
        }
    }

    private static void quickSort(int[] arr) {
        quickSortInner(arr, 0, arr.length - 1);
    }

    private static void quickSortInner(int[] arr, int left, int right) {
        if (left < right) {
            int partition = getPartition(arr, left, right);
            quickSortInner(arr, left, partition);
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
            while (left < right && arr[left] <= temp) {
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
            sortTwoPart(arr, temp, left, middle + 1, right);
        }
    }

    private static void sortTwoPart(int[] arr, int[] temp, int left, int middle, int right) {
        int index = left;
        int i = left;
        int j = middle;
        while (i < middle && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[index++] = arr[i++];
            } else {
                temp[index++] = arr[j++];
            }
        }
        while (i < middle) {
            temp[index++] = arr[i++];
        }
        while (j <= right) {
            temp[index++] = arr[j++];
        }
        for (index = left; index <= right; index++) {
            arr[index] = temp[index];
        }
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int max = arr[0];
            int maxIndex = 0;
            for (int j = 1; j <= i; j++) {
                if (arr[j] > max) {
                    maxIndex = j;
                    max = arr[j];
                }
            }
            swap(arr, i, maxIndex);
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            boolean isSwap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
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
