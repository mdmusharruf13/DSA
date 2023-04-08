public class InfiniteArrayElement{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,9,10,11,13,15,18,19,20};
        int target = 15;
        int start = 0;
        int end = 1;
        int incr = 2;
        while(target>arr[end]){
            incr = incr+incr;
            start = end+1;
            end += incr;
        }
        int res = binarySearch(arr,start,end,target);
        System.out.println(res);
    }
    static int binarySearch(int arr[], int start, int end, int target){
        int res = -1;
       
        while(start<=end){
            int mid = (start+end)/2;

            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }

        return res;
    }
}

