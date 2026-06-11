class Solution {
    public int maxSubArray(int[] nums) {
        // at index i=0 : bestEnding at that index and answer that index would be nums[0];
        int bestEnding = nums[0];
        int answer = nums[0];
        // now for each index we will have a bestending and it will have two choices : either to merge in it or to be new bestending 
        // we will choose the best choice for bestending
        // then we will choose best among bestending and answer i.e we will update the answer 
        for(int i=1;i<nums.length;i++){
            int ch1= bestEnding + nums[i];
            int ch2 = nums[i];
            bestEnding = Math.max(ch1,ch2);
            answer = Math.max(answer,bestEnding);
        }
        return answer;
    }
}