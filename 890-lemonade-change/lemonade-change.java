class Solution {
    public boolean lemonadeChange(int[] bills) {
        int N = bills.length;
        int five =0;
        int ten = 0;
        int twenty =0;
        for(int i=0;i<N;i++){
            if(bills[i]==5){
                five++;
            }
            else if(bills[i]==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else if(bills[i]==20){
                if(ten>0 && five>0){
                    ten--;
                    five--;
                    twenty++;
                }
                else if(five>=3){
                    five-=3;
                    twenty++;
                }
                else{
                    return false;
                }
            }
        }
        return true;
        
    }
}