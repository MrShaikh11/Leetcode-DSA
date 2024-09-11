class Solution {
    public boolean exist(char[][] board, String word) {
       for(int i=0;i<board.length;i++){
        for(int j =0;j<board[0].length;j++){
            if(board[i][j]==word.charAt(0) && dfs(board,word,0,i,j)) return true;
        }
       }
       return false;
    }

    public boolean dfs(char[][] board, String word, int cnt, int i , int j){
        if(cnt == word.length()) return true;
        if(i==-1 || i==board.length || j==-1 || j==board[0].length || board[i][j]!=word.charAt(cnt)) return false;
        char temp = board[i][j];
        board[i][j] = '*';
        boolean found = dfs(board,word,cnt+1,i+1,j) || 
                        dfs(board,word,cnt+1,i,j+1) ||
                        dfs(board,word,cnt+1,i-1,j) ||
                        dfs(board,word,cnt+1,i,j-1);
        board[i][j] = temp;
        return found;

    }
}