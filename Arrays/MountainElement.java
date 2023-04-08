public class MountainElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,4,3,2};
        int res = getPeakElement(arr);
        System.out.println(res);
    }
    static int getPeakElement(int arr[]){
        int start = 0;
        int end = arr.length-1;
        int index = -1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid] > arr[mid+1]){
                end = mid;
            }

            if(arr[start] == arr[end]){
                index = start;
                break;
            }
        }
        return index;
    }
}
