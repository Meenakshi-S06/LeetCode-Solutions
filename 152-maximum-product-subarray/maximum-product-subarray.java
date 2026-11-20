class Solution {
    public int maxProduct(int[] nums) {
        int N = nums.length;
        int prod = 1;
        if(N<2){
            return nums[0];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            prod = nums[i];
            max=Math.max(prod,max);
            for(int j=i+1;j<N;j++){
                prod*=nums[j];
                max = Math.max(max,prod);
            }
        }
        return max;
        
    }
}