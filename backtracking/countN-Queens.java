class Solution {
    int count = 0;
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        helper(n,0,board);
        return count;
    }
    private void helper(int n,int row,char[][] board){
        if(row == n){
            count++;
            return;
        }
        for(int j=0;j<n;j++){
        if(isSafe(board,row,j,n)){
            board[row][j] = 'Q';
            helper(n,row+1,board);
            board[row][j] = '.';
        }
        }
    }
    private boolean isSafe(char [][] board,int row,int col,int n){
        //horizontal
        for(int j=0;j<n;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for(int i=0;i<n;i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // Left diagonal
    for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
        if(board[i][j] == 'Q'){
            return false;
        }
    }

    // Right diagonal
    for(int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++){
        if(board[i][j] == 'Q'){
            return false;
        }
    }
    return true;
}
}
