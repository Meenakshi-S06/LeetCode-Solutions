class Solution {
    public int lastStoneWeight(int[] stones) {
        int N = stones.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<N;i++){
            pq.offer(stones[i]);
        }
        while(!pq.isEmpty()){
            int num1 = pq.poll();
            if(!pq.isEmpty()){
                int num2 = pq.poll();
                if(num1!=num2){
                    pq.offer(num1-num2);
                }
            }
            else{
                return num1;
            }
        }
        return 0;
        
    }
}