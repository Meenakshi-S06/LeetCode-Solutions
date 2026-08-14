class Solution {
    public int maxSubArray(int[] nums) {
        int N = nums.length;
        int curr = nums[0];
        int maxi = nums[0];
        for(int i=1;i<N;i++){
            curr = Math.max(nums[i],nums[i]+curr);
            maxi = Math.max(maxi,curr);
        }
        return maxi;
        
        
    }
}