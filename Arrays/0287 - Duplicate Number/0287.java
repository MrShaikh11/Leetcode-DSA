class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();

        for(int i =0;i<nums.length;i++){
                      int val = mpp.getOrDefault(nums[i], 0);
            mpp.put(nums[i], val + 1);

        }

         for (int num : mpp.keySet()) {
            if (mpp.get(num) > 1) {
                return num;
            }
        }
        return -1;
    }
}