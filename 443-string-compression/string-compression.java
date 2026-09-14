class Solution {
    public int compress(char[] chars) {
        int N = chars.length;
        if(N==1){
            char ch = chars[0];
            chars[0]=ch;
            return 1;
        }
        StringBuilder str = new StringBuilder();
        char ch = chars[0];
        int sum =1;
       for(int i=1;i<N;i++){
        if(chars[i]==chars[i-1]){
            sum++;
        }
        else{
            str.append(chars[i-1]);
            if(sum>1){
                str.append(sum);
            }
            ch = chars[i];
            sum =1;
        }
       }
       str.append(ch);
       if(sum>1){
        str.append(sum);
       }
        
        int len = str.length();
        for(int i=0;i<len;i++){
            chars[i]=str.charAt(i);
        }
        return len;
        
    }
}