import java.util.Arrays;

public class IBS{
    public static void main(String[] args) {
        IBS sort = new IBS();
        int arr1[] = {5,3,5,1,66,41,22,31,8,9};
        sort.bubbleSort(arr1);

        int arr2[] = {5,3,5,1,66,41,22,31,8,9};
        sort.selectionSort(arr2);

        int arr3[] = {5,3,5,1,66,41,22,31,8,9};
        sort.insertionSort(arr3);
    }

    void bubbleSort(int arr[]){
        for(int i=0; i < arr.length; i++){
            boolean flag = false;
            for(int j=0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    void selectionSort(int arr[]){
        for(int i=0; i < arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j < arr.length; j++){
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        System.out.println(Arrays.toString(arr));
    }

    void insertionSort(int arr[]){
        for(int i=0; i < arr.length-1; i++){
            for(int j=i+1; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}