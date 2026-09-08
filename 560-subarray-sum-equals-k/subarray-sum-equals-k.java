class Solution {
    public int subarraySum(int[] nums, int k) {
        int N = nums.length;
        int i=0;
        int sum=0;
        int cnt=0;
        while(i<N){
            sum=0;
        for(int j=i;j<N;j++){
            sum+=nums[j];
            if(sum==k){
                cnt++;
                //break;
            }
        }
        i++;
        }
        return cnt;
    }
}