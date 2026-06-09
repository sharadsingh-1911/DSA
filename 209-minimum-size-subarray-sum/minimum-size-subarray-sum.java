class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // inital window data 
        int low = 0;
        int high = 0;
        int result = Integer.MAX_VALUE;
        int sum =0;
        // changing window and new window data
        while(high < nums.length){
            sum += nums[high];
            while(sum >= target){
                int length = high - low + 1 ;
                result = Math.min(result,length);
                sum = sum - nums[low];
                low++;
            }
            high++;
        }
        // if no valid subarray exists we have to return 0
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}