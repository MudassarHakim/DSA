class Solution {
    //https://leetcode.com/problems/maximum-subarray/
    //https://www.techinterviewhandbook.org/best-practice-questions/
    public int maxSubArray(int[] nums) {
        int max= nums[0];
        int temp = 0;
        int n = nums.length;
        for(int i = 0; i<n; i++){
            temp += nums[i];
            max = Math.max(temp,max);
            
            if(temp<0) {
                temp = 0;
            }
        }
        return max;   
    }
}
