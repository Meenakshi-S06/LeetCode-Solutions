class Solution {
    public int pivotIndex(int[] nums) {
        int N = nums.length;
        int[] preb = new int[N];
        int[] prer = new int[N];
        int sb = 0;
        for(int i=0;i<N;i++){
            sb+=nums[i];
            preb[i]=sb;
        }
        int se = 0;
        for(int i=N-1;i>=0;i--){
            se+=nums[i];
            prer[i]=se;
        }
        for(int i=0;i<N;i++){
            if(preb[i]==prer[i]){
                return i;
            }
        }
        return -1;
        
    }
}