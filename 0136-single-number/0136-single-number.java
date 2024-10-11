class Solution {
    public int singleNumber(int[] nums) {
       Map<Integer,Integer> mpp = new HashMap<>();
       for(int i =0;i<nums.length;i++){
            int val = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],val+1);
       }

       for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
        if(it.getValue()==1) return it.getKey();
       }
       return -1;
    }
}