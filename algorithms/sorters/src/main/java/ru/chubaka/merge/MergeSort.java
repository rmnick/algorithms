package ru.chubaka.merge;

import ru.chubaka.ISort;
import ru.chubaka.Service;

import java.time.chrono.IsoChronology;
import java.util.Arrays;

public class MergeSort implements ISort {
    public static int count = 1;
    public static void main(String[] args) {
        int[] arr = Service.getArr(11111111);
//        Service.showArr(arr);
        ISort sorter = new MergeSort();
        long start = System.currentTimeMillis();
        arr = sorter.sort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
//        System.out.println();
//        Service.showArr(arr);

    }

    public static int countStep() {
        return count++;
    }

    @Override
    public int[] sort(int[] arr) {
        int step = 1;
        if (arr.length < 2) {
            return arr;
        } else {
            int[] buffOne = sort(Arrays.copyOfRange(arr, 0, arr.length /2 ));
            int[] buffTwo = sort(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
            return merge(buffOne, buffTwo);
        }
    }

    public int[] merge(int[] arrOne, int[] arrTwo) {
        int[] result = new int[arrOne.length + arrTwo.length];
        int indexOne = 0, indexTwo = 0, indexResult = 0;
        while (indexOne < arrOne.length && indexTwo < arrTwo.length) {
            if (arrOne[indexOne] < arrTwo[indexTwo]) {
                result[indexResult++] = arrOne[indexOne++];
            } else {
                result[indexResult++] = arrTwo[indexTwo++];
            }
        }
        while (indexOne < arrOne.length) {
            result[indexResult++] = arrOne[indexOne++];
        }
        while (indexTwo < arrTwo.length) {
            result[indexResult++] = arrTwo[indexTwo++];
        }
        return result;
    }
}
