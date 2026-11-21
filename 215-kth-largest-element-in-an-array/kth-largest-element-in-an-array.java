class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int N = nums.length;
        for(int i=0;i<N;i++){
            pq.offer(nums[i]);
        }
        int cnt = 1;
        while(cnt<k){
            cnt++;
            pq.poll();
        }
        if(!pq.isEmpty()){
            return pq.poll();
        }
        return 0;
        
    }
}