class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int N = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<N;i++){
            if(asteroids[i]>0){
                st.push(asteroids[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>0 &&st.peek()<Math.abs(asteroids[i])){
                    st.pop();
                }
                if(!st.isEmpty() && st.peek()==Math.abs(asteroids[i])){
                    st.pop();

                }
                else if(st.isEmpty() ||st.peek()<0){
                    st.push(asteroids[i]);
                }
            }

        }
        int M = st.size();
        int[] ans = new int[M];
        int ind = M-1;
        while(!st.isEmpty()){
            ans[ind]=st.pop();
            ind--;
        }
        return ans;
        
    }
}