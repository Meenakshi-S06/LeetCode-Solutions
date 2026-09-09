class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int N = nums1.length;
        int M = nums2.length;
        int[] arr = new int[N];
        int ind =0;
        while(ind<N){
            for(int i=0;i<M;i++){
                if(nums1[ind]==nums2[i]){
                    System.out.println(nums1[ind]+" "+nums2[i]+" "+(i+1));
                    int max = -1;
                    for(int k =i+1;k<M;k++){
                        if(nums2[k]>nums2[i]){
                            max = nums2[k];
                            break;
                        }
                    }
                    arr[ind]=max;
                }
            }
            ind++;
        }
        return arr;
        
    }
}