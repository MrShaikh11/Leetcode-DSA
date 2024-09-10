class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);
        int preSum = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i];
            if (mpp.containsKey(preSum - k)) {
                cnt = cnt + mpp.getOrDefault((preSum - k), 0);
            }
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}