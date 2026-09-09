class Solution {
    public int[] decrypt(int[] code, int k) {
        int N = code.length;
        int[] arr = new int[N];
        if(k==0){
            return arr;
        }
        for(int i=0;i<N;i++){
            int sum=0;
            if(k>0){
                for(int j=1;j<=k;j++){
                    sum+=code[(i+j)%N];
                }
            }
            else{
                for(int j=1;j<=-k;j++){
                    sum+=code[(i-j+N)%N];
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}