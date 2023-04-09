import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {

        // int arr[] = {5,4,3,2,1};
        int arr[] = {-2,5,3,1,0,-11,-5,10,6};
        Selection(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void Selection(int[] arr) {

        for(int i=0; i<arr.length; i++){

            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }

            }
            swap(arr,minIndex,i);
        }

    }

    private static void swap(int[] arr, int minIndex, int i) {

        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;

    }
}