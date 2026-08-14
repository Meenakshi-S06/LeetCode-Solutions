class Solution {
    public int[] twoSum(int[] nums, int target) {
        int N = nums.length;
        HashMap<Integer,Integer> res = new HashMap<>();
        for(int i=0;i<N;i++){
            if(res.containsKey(target-nums[i])){
                return new int[]{res.get(target-nums[i]),i};
            }
            else{
                res.put(nums[i],i);
            }
        }
        return new int[]{0,0};
        
    }
}