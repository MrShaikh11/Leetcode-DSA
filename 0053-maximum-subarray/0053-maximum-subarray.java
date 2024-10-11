class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int smallest=0;
        int largest=nums[0];
        if(nums.length==1) return nums[0];
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>largest) largest=sum;
            if((sum-smallest)>largest) largest=(sum-smallest);
            smallest = sum<smallest?sum:smallest;

        }

        return largest;
    }
}