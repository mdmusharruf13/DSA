import java.util.Arrays;

public class FirstAndLastIndex{
    public static void main(String[] args) {
        int arr[] = {5,6,7,7,7,7,8,8,10};
        int index[] = {-1,-1};
        int target = 8;
        index[0] = search(arr,target,true);
        if(index[0]!=-1){
            index[1] = search(arr,target,false);
        }
        System.out.println(Arrays.toString(index));
    }
    static int search(int arr[], int target, boolean flag){
        int index = -1;
        int first = 0;
        int last = arr.length-1;
        while(first<=last){
            int mid = (first+last)/2;

            if(target > arr[mid]){
                first = mid+1;
            }
            else if(target < arr[mid]){
                last = mid-1;
            }
            else{
                index = mid;
                if(flag){
                    last = mid-1;
                }
                else{
                    first = mid+1;
                }
            }
        }
        return index;
    }
}