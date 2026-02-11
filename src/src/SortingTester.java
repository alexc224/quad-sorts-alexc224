import java.util.Arrays;
import java.util.Random;
public class SortingTester {
    public static void main(String[] args){
        //insert the method you need tested. Example:
        //testMerge();
        testBubble();
    }
    public static int[] randomArray(){
        Random random = new Random();
        int selection = random.nextInt(2, 7);
        int n = Math.powExact(10, selection);
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = random.nextInt(n);
        }
        return arr;
    }

    public static void testMerge(){
        int[] arr = randomArray();
        long time1 = System.currentTimeMillis();
        QuadSorts.mergeSort(arr);
        long time2 = System.currentTimeMillis();

        long time = time2 - time1;
        System.out.println("mergeSort with " + arr.length + " array size in: " + time + "ms");
    }
    public static void testBubble(){
        int[] arr = randomArray();
        long time1 = System.currentTimeMillis();
        QuadSorts.bubbleSort(arr);
        long time2 = System.currentTimeMillis();

        long time = time2 - time1;
        System.out.println("bubbleSort with " + arr.length + " array size in: " + time + "ms");
    }
    public static void testSelection(){
        int[] arr = randomArray();
        long time1 = System.currentTimeMillis();
        QuadSorts.selectionSort(arr);
        long time2 = System.currentTimeMillis();

        long time = time2 - time1;
        System.out.println("selectionSort with " + arr.length + " array size in: " + time + "ms");
    }
    public static void testInsertion(){
        int[] arr = randomArray();
        long time1 = System.currentTimeMillis();
        QuadSorts.insertionSort(arr);
        long time2 = System.currentTimeMillis();

        long time = time2 - time1;
        System.out.println("insertionSort with " + arr.length + " array size in: " + time + "ms");
    }
}
