import java.util.Arrays;

public class QuadSorts {
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i ++){
            for(int j = 0; j < n - 1; j ++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i ++){// loop 1
            int minIndex = i;
            for(int j  = i + 1; j < n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                arr[j] = key;
                j -= 1;
            }
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr){
        int n = arr.length;
        if(n == 1){
            return  arr;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = 0; i < n - mid; i++){
            right[i] = arr[mid + i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right, arr);
    }

    private static int[] merge(int[] left, int[] right, int[] arr){
        int n = arr.length;
        int i = 0;
        int j = 0;
        int k = 0;

        while(k < right.length && j < left.length){
            if(left[j] <= right[k] ){
                arr[i] = left[j];
                i++;
                j++;
            } else{
                arr[i] = right[k];
                i++;
                k++;
            }
        }
        while(j < left.length){
            arr[i] = left[j];
            i++;
            j++;
        }
        while(k < right.length){
            arr[i] = right[k];
            i++;
            k++;
        }
        return arr;
    }
}
