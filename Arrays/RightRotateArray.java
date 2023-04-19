import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,5,6,10,12};
        int n = 2;
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<n; i++){
            int j, lastElement;
                lastElement = arr[arr.length-1];
                for(j=arr.length-1; j>0; j--){
                    arr[j] = arr[j-1];
                }
                arr[0] = lastElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}

