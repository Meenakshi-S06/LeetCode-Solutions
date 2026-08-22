class Trie{
    String word;
    Trie chars[] = new Trie[26];
}
class Solution {
    int diff[]={0,1,0,-1,0};
    void dfs(char board[][] ,int R,int C,int row,int col,Trie t,List<String> ans,boolean[][] vis){
        int chidx =board[row][col]-'a';
        if(t.chars[chidx]==null){
            return;
        }
        Trie curr =t.chars[chidx];
        if(curr.word!=null){
            ans.add(curr.word);
            curr.word=null;
        }
        vis[row][col]=true;
        for(int i=0;i<4;i++){
            int adjr = row+diff[i];
            int adjc = col+diff[i+1];
            if(adjr>=0 && adjc>=0 && adjr<R && adjc<C && !vis[adjr][adjc] ){
                dfs(board,R,C,adjr,adjc,curr,ans,vis);
            }
        }
        vis[row][col]=false;
        
    }
    void buildTrie(Trie p,String word,int idx){
        int chidx=word.charAt(idx)-'a';
        if(p.chars[chidx]==null){
            p.chars[chidx]=new Trie();
        }
        Trie curr=p.chars[chidx];
        if(idx==word.length()-1){
            curr.word=word;
            return;
        }
        buildTrie(curr,word,idx+1);
    }
    public List<String> findWords(char[][] board, String[] words) {
        Trie root = new Trie();
        for(String word:words) {
            buildTrie(root,word,0);
        }
        List<String> ans = new ArrayList<>();
        int R = board.length;
        int C = board[0].length;
        boolean[][] vis = new boolean[R][C];
        for(int r = 0;r<R;r++){
            for(int c =0;c<C;c++){
                dfs(board,R,C,r,c,root,ans,vis);
            }
        }
        return ans;

    }
}