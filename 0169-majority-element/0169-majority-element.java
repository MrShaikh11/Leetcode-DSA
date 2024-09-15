import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            int val = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],val+1);
        }

        for(Map.Entry<Integer,Integer> mp: mpp.entrySet()){
            if(mp.getValue()>nums.length/2) return mp.getKey();
        }
        return -1;
    }
}