class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> list = new ArrayList<>();
        int l = 0;
        int t=0;
        int r = m-1;
        int b = n-1;

        int i,j;
        while(l<=r && t<=b){
        
            for(i=l;i<=r;i++){
                list.add(matrix[t][i]);
            }
            t++;
            for(i=t;i<=b;i++){
                list.add(matrix[i][r]);
            }
            r--;
            if(t<=b){

            for(i=r;i>=l;i--){
                list.add(matrix[b][i]);
            }
            b--;
            }
            if(l<=r){

            for(i=b;i>=t;i--){
                list.add(matrix[i][l]);
            }
            l++;
            }
        }
        return list;

    }
}