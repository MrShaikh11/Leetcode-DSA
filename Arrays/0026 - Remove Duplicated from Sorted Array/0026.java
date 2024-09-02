class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        int sort = 0;
        int curr = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == curr && cnt == 0) {
                sort++;
                cnt++;
            }
            if (nums[i] != curr) {
                nums[sort] = nums[i];
                cnt++;
                sort++;
            }
            curr = nums[i];
        }

        return cnt;
    }
}