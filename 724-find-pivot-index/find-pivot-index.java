class Solution {
    public int pivotIndex(int[] nums) {
        int N = nums.length;
        int ans = -1;
        for(int i=0;i<N;i++){
            boolean flag = true;
            int s1 =0;
            for(int j=0;j<i;j++){
                s1+=nums[j];
            }
            int s2 =0;
            for(int k=i+1;k<N;k++){
                s2+=nums[k];
            }
            if (s1==s2){
                return i;
            }
        }
        return -1;       
        
    }
}