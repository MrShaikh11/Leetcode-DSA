class Solution {
    public int subarraySum(int[] nums, int k) {
       Map<Integer,Integer> mpp = new HashMap<>();

       int preSum=0;
       int cnt=0;
        mpp.put(0,1);
       for(int i =0;i<nums.length;i++){
        preSum+=nums[i];
        
        int x = (preSum-k);

        if(mpp.containsKey(x)){
            cnt +=mpp.getOrDefault(x,0);
        }
        mpp.put(preSum, mpp.getOrDefault(preSum,0)+1);
       }
       return cnt;
    }
}