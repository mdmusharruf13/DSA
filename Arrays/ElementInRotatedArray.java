public class ElementInRotatedArray{
    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,0,1,2,3,4};
        int target = 3;
        // int arr[] = {1,2,3,4,5,6};
        // int target = 2;
        int res = findIndex(arr,target);
        System.out.println(res);
    }

    static int findIndex(int arr[], int target){
        int pivot = getIndexOfPivot(arr);
        if(pivot == -1){
            pivot = binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target > arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    private static int binarySearch(int[] arr, int target,int start, int end) {
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return 0;
    }

    static int getIndexOfPivot(int arr[]){
        int index = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(start < mid && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return index;
    }
}