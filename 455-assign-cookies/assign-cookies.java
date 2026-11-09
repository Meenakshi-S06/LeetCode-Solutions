class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int N =g.length;
        int M =s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l =0;
        int r =0;
        while(l<N && r<M){
            if(g[l]<=s[r]){
                l=l+1;
            }
            r=r+1;
        }
        return l;
        
    }
}