import java.util.Arrays;

public class LeftRightSumDiff{
    public static void main(String[] args) {
        int nums[] = {10,4,8,3};
        int arr[] = getDifference(nums);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] getDifference(int[] nums) {
        int rArr[] = new int[nums.length];
        int lArr[] = new int[nums.length];
        rArr[0] = 0;
        lArr[nums.length-1] = 0;
        for(int i=1; i < nums.length; i++){
            rArr[i] = rArr[i-1] + nums[i-1];
        }
        for(int i= nums.length-2; i >= 0; i--){
            lArr[i] = lArr[i+1] + nums[i+1];
        }
        int diff[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            diff[i] = Math.abs(lArr[i] - rArr[i]);
        }
        return diff;
    }
}


/*

Input: nums = [10,4,8,3]
Output: [15,1,11,22]
Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

Input: nums = [1]
Output: [0]
Explanation: The array leftSum is [0] and the array rightSum is [0].
The array answer is [|0 - 0|] = [0].

 */