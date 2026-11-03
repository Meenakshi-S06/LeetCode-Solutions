class Solution {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>();
        int N = str.length();
        for(int i=0;i<N;i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
                st.push(str.charAt(i));
            }
            else if(st.isEmpty() || (str.charAt(i)==')' && st.peek()!='(')||(str.charAt(i)=='}' && st.peek()!='{')||(str.charAt(i)==']' && st.peek()!='[')){
                System.out.println(str.charAt(i));
                return false;
            }
            else{
                st.pop();
            }
        }
        if(st.size()!=0){
            return false;
        }
        return true;
        
    }
}