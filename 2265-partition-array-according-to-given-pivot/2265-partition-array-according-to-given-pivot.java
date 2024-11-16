class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // for(int i =0;i<nums.length;i++){
            int arr2[] = new int[nums.length];
            int arr1[] = new int[nums.length];
            int a=0;
            int b=0;
            int cnt=0;
            for(int i =0;i<nums.length;i++){
                if(nums[i]==pivot) cnt++;
                else if(nums[i]<pivot){
                    arr1[a] = nums[i];
                    a++;
                }
                else{
                    arr2[b] = nums[i];
                    b++;
                }
            }
            for (int i =0;i<cnt;i++){
                arr1[a] = pivot;
                a++;
            }
            int x=0;
            for (int i =a;i<nums.length;i++){
                arr1[i]= arr2[x++];
                
            
            
        }
        return arr1;
    }
}