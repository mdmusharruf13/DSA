import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int arr[] = {5,4,3,-9,-5,-4,-1,0,2,1};
        int arr[] = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubble(int[] arr) {
        boolean swapped;
        for(int i=0; i<arr.length-1; i++){
            swapped = false;
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                // breaking bcoz in first iteration no swapped is done so we think as array is sorted
                break; 
            }
        }
    }
}
