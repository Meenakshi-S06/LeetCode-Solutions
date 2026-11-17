class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int N = gain.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            sum+=gain[i];
            max=Math.max(max,sum);
        }
        if(max<0){
            return 0;
        }
        return max;
        
    }
}