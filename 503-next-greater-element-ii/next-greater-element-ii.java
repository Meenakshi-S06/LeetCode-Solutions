class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int N = arr.length;
        int[] temp = new int[2*N];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<N;i++){
            temp[i]=arr[i];
            temp[i+N]=arr[i];
        }
        int[] ans = new int[N];
        for(int i=2*N-1;i>=0;i--){
            if(i>N){
                 if(st.isEmpty()){
                    st.push(temp[i]);
                }
                else{
                    if(st.peek()<=temp[i]){
                        while(!st.isEmpty() && st.peek()<=temp[i]){
                            st.pop();
                        }
                        st.push(temp[i]);
                    }
                    else{
                        st.push(temp[i]);
                    }
                }
                
            }
            else{
                if(st.isEmpty()){
                    st.push(temp[i]);
                    int ind = i%N;
                    ans[ind]=-1;
                }
                else{
                    if(st.peek()<=temp[i]){
                        while(!st.isEmpty() && st.peek()<=temp[i]){
                            st.pop();
                        }
                        if(st.isEmpty()){
                            st.push(temp[i]);
                            int ind = i%N;
                            ans[ind]=-1;
                        }
                        else{
                            ans[i%N]=st.peek();
                            st.push(temp[i]);
                        }
                    }
                    else{
                        ans[i%N]=st.peek();
                        st.push(temp[i]);
                    }
                }

            }
        }
        return ans;
    }
}