class Solution {
    public int missingMultiple(int[] nums, int k) {
        int N = nums.length;
        if(N==1){
            if(nums[0]<k){
                return k;
            }
        }
        List<Integer> st = new ArrayList<>();
        int max = 0;
        for(int i=0;i<N;i++){
            st.add(nums[i]);
            if(nums[i]%k==0){
                max=Math.max(nums[i],max);
            }
        }
        for(int i=k;i<=max;i+=k){
            if(!st.contains(i)){
                return i;
            }
        }
        return max+k;

        
    }
}