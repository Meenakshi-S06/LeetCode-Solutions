class Solution {
    public String reverseVowels(String s) {
        int N =s.length();
        Stack<Character> st = new Stack();
        StringBuilder str = new StringBuilder();
        for(int i=0;i<N;i++){
            char ch = s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                st.push(ch);
            }
        }
        for(int i=0;i<N;i++){
            char ch =s.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                str.append(st.pop());
            }
            else{
                str.append(ch);
            }

        }
        return str.toString();
    }
}