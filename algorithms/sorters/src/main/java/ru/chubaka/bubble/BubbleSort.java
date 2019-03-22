
package ru.chubaka.bubble;

import java.util.Arrays;
import java.util.stream.*;
import ru.chubaka.Service;

/**
 * 
 * @author nick rodionov
 */
public class BubbleSort { 
    
    public static void main (String[] args) {
        BubbleSort sorter = new BubbleSort();
        int[] oddArr = Service.getArr(21);
        int[] evenArr = Service.getArr(20);
        Service.showArr(oddArr);
        Service.showArr(evenArr);
        oddArr = sorter.sort(oddArr);
//        evenArr = sorter.sort(evenArr);
        Service.showArr(oddArr);
//        Service.showArr(evenArr);
    }
    
    public int[] sort(final int[] arr) {
//        int[] result = new int[arr.length];
//        int[] result = Arrays.stream(arr).toArray(int[] :: new);
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
