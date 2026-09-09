class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int N = nums.length;
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i=0;i<N;i++){
            if(st.containsKey(nums[i])){
                int prev = st.get(nums[i]);
                if((i-prev)<=k){
                    return true;
                }
            }
            st.put(nums[i],i);
        }return false;
    }
}