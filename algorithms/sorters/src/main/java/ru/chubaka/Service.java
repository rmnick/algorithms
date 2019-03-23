
package ru.chubaka;

/**
 *
 * @author User nick
 */
public class Service {
    
    public static int[] getArr(final int number) {
        int[] arr = new int[number];
        for (int i = 0; i < number; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
    
    public static void showArr(final int[] arr) {
        for (int num : arr) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
    
    
}
