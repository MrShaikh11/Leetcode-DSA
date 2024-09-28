class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m =needle.length();
        if(m>n)return -1;
        if(m==0) return 0;
        for(int i =0;i<=n-m;i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                // if(m==1)return 0;
                int j=i+1;
                int k=1;
                int flag = 1;
                while(k<m){
                    if(haystack.charAt(j)!=needle.charAt(k)){
                        flag=-1;
                        break;
                    }
                    k++;
                    j++;
                }
                if(flag==1) return i;

        }
        }
        return -1;
    }
}