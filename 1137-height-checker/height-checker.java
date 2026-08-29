class Solution {
    public int heightChecker(int[] heights) {
        int N = heights.length;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        int ind=0;
        for(int i=0;i<N;i++){
            if(arr[i]!=heights[i]){
                ind++;
            }
        }
        return ind;
    }
}