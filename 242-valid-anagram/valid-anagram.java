class Solution {
    public boolean isAnagram(String s, String t) {
        int N =s.length();
        int M =t.length();
        if(N!=M){
            return false;
        }
        HashMap<Integer,Character> st = new HashMap<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 =t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<N;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
        
    }
}