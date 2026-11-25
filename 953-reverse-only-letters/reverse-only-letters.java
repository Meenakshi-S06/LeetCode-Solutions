class Solution {
    public void swap(int start,int end,char[] arr){
        char temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public String reverseOnlyLetters(String s) {
        int N =s.length();
        char[] arr = s.toCharArray();
        int i=0;
        int j=N-1;
        while(i<j){
            if(Character.isLetter(arr[i]) && Character.isLetter(arr[j])){
                swap(i,j,arr);
                i++;
                j--;
            }
            else if(!Character.isLetter(arr[i])){
                i++;
            }
            else if(!Character.isLetter(arr[j])){
                j--;
            }
        }
        return new String(arr);
        
    }
}