class Solution {
    public int totalFruit(int[] nums) {
        int N = nums.length;
        int j=0;
        int max=0;
        HashMap<Integer,Integer> st = new HashMap<>();
        for(int i=0;i<N;i++){
            st.put(nums[i],st.getOrDefault(nums[i],0)+1);
            while(st.size()>2) {
                st.put(nums[j],st.get(nums[j])-1);
                if(st.get(nums[j])==0){
                    st.remove(nums[j]);
                }
                j++;
            }
            max= Math.max(max,i-j+1);
        }
        return max;
        
        
    }
}