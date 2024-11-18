class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mpp = new HashMap<>();
        int ans[] = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        for(int i=0;i<nums.length;i++){
            int preSum = target - nums[i];
            if(mpp.containsKey(preSum)){
                ans[0] = i;
                ans[1] = mpp.get(preSum);
            }
            else{
                mpp.put(nums[i],i);
            }
        }

        return ans;
    }
}