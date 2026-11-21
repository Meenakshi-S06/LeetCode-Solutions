class Solution {
    public String[] assignUmbrella(int[] arr) {
        int N = arr.length;
        String ans[] = new String[N];
        int acnt =0;
        int bcnt =0;
        for(int i=0;i<N;i++){
            if(i+1<N){
                if(arr[i]==1 && arr[i+1]==1){
                        if(acnt<bcnt){
                            ans[i]="Alice";
                            acnt++;
                        }
                        else if(bcnt<acnt){
                            ans[i]="Bob";
                            bcnt++;
                        }
                        else{
                            ans[i]="Alice";
                            acnt++;
                        }
                   
                }
                else if(arr[i]==1 && arr[i+1]==0){
                    ans[i]="Bob";
                    bcnt++;
                }
                else if(arr[i]==0){
                    ans[i]="None";
                }
            }
            else{
                if(arr[i]==1){
                    ans[i]="Bob";
                    bcnt++;
                }
                else{
                    ans[i]="None";
                }
            }
        }
        return ans;
        
    }
}