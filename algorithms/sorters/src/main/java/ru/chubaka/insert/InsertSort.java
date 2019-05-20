package ru.chubaka.insert;

import ru.chubaka.ISort;
import ru.chubaka.Service;
import ru.chubaka.select.SelectSort;

/**
 *
 * @author nick rodionov
 */

public class InsertSort implements ISort {
    public static void main(String[] args) {
        ISort sorter = new InsertSort();
        int[] oddArr = Service.getArr(21);
        int[] evenArr = Service.getArr(20);
        Service.showArr(oddArr);
        Service.showArr(evenArr);
        oddArr = sorter.sort(oddArr);
        Service.showArr(oddArr);
        evenArr = sorter.sort(evenArr);
        Service.showArr(evenArr);
    }

    @Override
    public int[] sort(final int[] arr) {
        int in, out;
        for (out = 1; out < arr.length; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
        return arr;
    }
}
