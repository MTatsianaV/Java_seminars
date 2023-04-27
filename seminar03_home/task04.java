package seminar03_home;
/*
Реализовать алгоритм сортировки слиянием
 */

import java.util.Arrays;

public class task04 {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        int middleIndex = arr.length / 2;
        int[] leftArr = new int[middleIndex];
        int[] rightArr = new int[arr.length - middleIndex];

        for (int i = 0; i < middleIndex; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = middleIndex; i < arr.length; i++) {
            rightArr[i - middleIndex] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(leftArr, rightArr, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftIndex = 0;
        int rightIndex = 0;
        int index = 0;

        while (leftIndex < leftArr.length && rightIndex < rightArr.length) {
            if (leftArr[leftIndex] < rightArr[rightIndex]) {
                arr[index] = leftArr[leftIndex];
                leftIndex++;
            } else {
                arr[index] = rightArr[rightIndex];
                rightIndex++;
            }
            index++;
        }

        while (leftIndex < leftArr.length) {
            arr[index] = leftArr[leftIndex];
            leftIndex++;
            index++;
        }

        while (rightIndex < rightArr.length) {
            arr[index] = rightArr[rightIndex];
            rightIndex++;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 6, 1, 8, 7, 3, 4 };
        System.out.println("До сортировки: " + Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("После сортировки: " + Arrays.toString(arr));
    }
    
}
