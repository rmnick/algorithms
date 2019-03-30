/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.chubaka.insert;

import ru.chubaka.Service;
import ru.chubaka.select.SelectSort;

/**
 *
 * @author User
 */
public class InsertSort {
    
    public static void main(String[] args) {
        long start;
        long end;
        SelectSort sorter = new SelectSort();
		int[] oddArr = Service.getArr(501);
		int[] evenArr = Service.getArr(20);
		Service.showArr(oddArr);
		Service.showArr(evenArr);
                start = System.currentTimeMillis();
		oddArr = sorter.sort(oddArr);
                end = System.currentTimeMillis();
                evenArr = sorter.sort(evenArr);
		Service.showArr(oddArr);
                Service.showArr(evenArr);
                System.out.println(end - start);
    }
    
    public int[] sort(int[] arr) {
        int in, out, temp;
        for (out = 1; out < arr.length; out++) {
            temp = arr[out];
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
