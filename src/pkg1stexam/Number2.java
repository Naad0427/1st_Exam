
package pkg1stexam;

import java.util.Arrays;


public class Number2 {
    public class BubbleSort {
    public static void main(String[] args) {
        String[] fruits = { "banana", "apple", "lanzones", "durian", "rambotan", "kiwi", "mansanitas" };

        
        bubbleSort(fruits);

        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1].length() > arr[i].length()) {
                    
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            
            
            n--;
        } while (swapped);
    }
}
}

