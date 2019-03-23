package ru.chubaka.select;

import ru.chubaka.Service;


public class SelectSort {
	public static void main(String[] args) {
		SelectSort sorter = new SelectSort();
		int[] oddArr = Service.getArr(21);
		int[] evenArr = Service.getArr(20);
		Service.showArr(oddArr);
		Service.showArr(evenArr);
		oddArr = sorter.sort(oddArr);
		Service.showArr(oddArr);
	}

	public int[] sort(final int[] arr) {
		int min;
		int temp;
		int next;
		for (int i = 0; i < arr.lenght - 1; i++) {
			min = i;
			for (next = i + 1; next < arr.lenght; next++) {
				if (arr[next] < arr[min]) {
					min = next;
				}
			}
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}
}