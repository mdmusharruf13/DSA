public class OrderAgnosticsBS{
    public static void main(String[] args) {
        // int arr[] = {1,2,12,15,18,20,25,59,98};
        int arr[] = {78,59,45,44,20,18,9,8,2};
        int target = 59;
        int res = BinarySearch(arr,target); 
        System.out.println(res);
    }
    static int BinarySearch(int arr[], int target){

        boolean isAsc = arr[0] < arr[arr.length-1];

        int start = 0;
        int end = arr.length-1;
        
        while(start<=end){

            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            }
            
            if(isAsc){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }
}