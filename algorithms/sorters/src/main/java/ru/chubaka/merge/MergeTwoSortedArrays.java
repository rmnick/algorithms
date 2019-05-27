package ru.chubaka.merge;

import ru.chubaka.ISort;
import ru.chubaka.Service;
import ru.chubaka.select.SelectSort;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        MergeTwoSortedArrays merger = new MergeTwoSortedArrays();
        ISort sorter = new SelectSort();
        int[] arrOne = sorter.sort(Service.getArr(10));
        int[] arrTwo = sorter.sort(Service.getArr(11));
        Service.showArr(arrOne);
        Service.showArr(arrTwo);
        System.out.println(arrOne.length);
        int[] result = merger.merge(arrOne, arrTwo);
        Service.showArr(result);
        System.out.println(result.length);
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
