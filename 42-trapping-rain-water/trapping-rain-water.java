class Solution {
    public int trap(int[] height) {
        int N = height.length;
        int[] prefix = new int[N];
        int[] suffix = new int[N];
        prefix[0]=height[0];
        suffix[N-1]=height[N-1];
        for(int i=1;i<N;i++){
            prefix[i]=Math.max(prefix[i-1],height[i]);
        }
        for(int i=N-2;i>=0;i--){
            suffix[i]=Math.max(suffix[i+1],height[i]);
        }
        int total = 0;
        for(int i=0;i<N;i++){
            if(i>0 && i<N-1 && height[i]<prefix[i-1] && height[i]<suffix[i+1]){
                total+=Math.min(prefix[i-1],suffix[i+1])-height[i];

            }
        }
        return total;
        
    }
}