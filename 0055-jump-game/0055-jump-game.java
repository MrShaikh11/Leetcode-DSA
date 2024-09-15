class Solution {
    public boolean canJump(int[] nums) {
        for(int i=0;i<nums.length;i++){
            i+=nums[i];

            if(i==(nums.length-1)) return true;
            if(i>(nums.length-1)) return false;
        }
        return true;
    }
}