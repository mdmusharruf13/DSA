public class SubArraySum{
    public static void main(String[] args) {
        int arr[] = {10,2,6,8,9,7,20};
        int sum = 27;
        int currentSum = arr[0];
        int start = 0, i;
        for(i=1; i<=arr.length; i++){
            while(currentSum > sum && start < i-1){
                currentSum -= arr[start];
                start++;
            }
            if(currentSum == sum){
                int pos = i-1;
                System.out.println("sum is found between index "+start+" and "+pos);
                return ;
            }
            if(i < arr.length){
                currentSum += arr[i];
            }
        }
        System.out.println("No sub array found");
    }
}