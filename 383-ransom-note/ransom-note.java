class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int N = ransomNote.length();
        int M = magazine.length();
        HashMap<Character,Integer> st = new HashMap<>();
        HashMap<Character,Integer> sr = new HashMap<>();
        for(int i=0;i<M;i++){
            st.put(magazine.charAt(i),st.getOrDefault(magazine.charAt(i),0)+1);
        }
        for(int i=0;i<N;i++){
            sr.put(ransomNote.charAt(i),sr.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        boolean flag = true;
        for(Character a :sr.keySet()){
            if(st.containsKey(a)){
                int size = st.get(a);
                if(size<sr.get(a)){
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}