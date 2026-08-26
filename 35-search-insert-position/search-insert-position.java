class Solution {
    public int searchInsert(int[] nums, int target) {
        int N = nums.length;
        int low =0;
        int high = N-1;
        int ans =N;
        while(low<=high){
            int mid =(low+high)/2;
            if(nums[mid]>=target){
                ans = mid;
                high =mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}