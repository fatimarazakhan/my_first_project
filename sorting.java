import java.util.*;

public class sorting {

    // -------------------------
    // LINEAR SEARCH
    // -------------------------
    public static int linearSearch(int arr[], int key) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key)
                return i; // found
        }
        return -1; // not found
    }
    public static int binarySearch(int arr[], int key) {
        int left = 0, right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == key)
                return mid;

            if(arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
// bublle
    public static void bubbleSort(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    // SELECTION SORT
    
    public static void selectionSort(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    // INSERTION SORT
    
    public static void insertionSort(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }


    public static void main(String[] args) {

        int arr[] = {34, 7, 23, 32, 5, 62};

        System.out.println("Original Array: " + Arrays.toString(arr));

        
        bubbleSort(arr);
        System.out.println("Sorted (Bubble): " + Arrays.toString(arr));

        // Searching Example
        int key = 23;
        int pos = binarySearch(arr, key);

        if(pos != -1)
            System.out.println("Element found at index: " + pos);
        else
            System.out.println("Element not found");
    }
}



