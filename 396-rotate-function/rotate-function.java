class Solution {
    public int maxRotateFunction(int[] nums) {
        int N = nums.length;
        long temp=N-1;
        long sum =0;
        long val =0;
        if(N==1){
            return 0;
        }
        long max =Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            sum+=nums[i];
            val+=(nums[i]*i);
        }
        max=val;
        int ind=N-1;
        while(temp-->0){
            val=val-((N-1)*nums[ind])+(sum-nums[ind--]);
            System.out.println(val);
            max=Math.max(max,val);
        }
        return (int) max;       
                
    }
}