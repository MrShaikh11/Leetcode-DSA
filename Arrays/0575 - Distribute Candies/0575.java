class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            if(!mpp.containsKey(candyType[i])){
                mpp.put(candyType[i],1);
            }
            else{
                int cnt = mpp.get(candyType[i]);
                mpp.put(candyType[i],cnt+1);
            }
        } 
        if((candyType.length/2)<mpp.size()) return candyType.length/2;
            else return mpp.size();
    }
}