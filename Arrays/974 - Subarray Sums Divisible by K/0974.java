class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();

        mpp.put(0, 1);
        int sum = 0, ans = 0;

        for (int num : nums) {
            sum += num;
            int rem = sum % k;
            if (rem < 0)
                rem += k;

            if (mpp.containsKey(rem)) {
                ans += mpp.get(rem);
            }

            mpp.put(rem, mpp.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}