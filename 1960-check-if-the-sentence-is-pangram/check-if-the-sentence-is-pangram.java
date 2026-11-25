class Solution {
    public boolean checkIfPangram(String sentence) {
        int N = sentence.length();
        char[] arr= sentence.toCharArray();
        HashMap<Character,Integer> st = new HashMap<>();
        for(int i=0;i<N;i++){
            st.put(arr[i],st.getOrDefault(arr[i],0)+1);
        }
        if(st.size()!=26){
            return false;
        }
        return true;
        
        
    }
}