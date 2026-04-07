class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        
        char[][] board = new char[n][n];
        
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        
        NQueen(res, board, n, 0);
        return res;
    }

    private void NQueen(List<List<String>> res, char[][] board, int n, int row) {
        if (row == n) {
            res.add(construct(board));
            return;
        }

        for (int j = 0; j < n; j++) {
            if (isSafe(board, row, j, n)) {
                board[row][j] = 'Q';
                NQueen(res, board, n, row + 1);
                board[row][j] = '.'; // backtrack
            }
        }
    }

    private List<String> construct(char[][] board) {
        List<String> ans = new ArrayList<>();
        for (char[] row : board) {
            ans.add(new String(row));
        }
        return ans;
    }
    private boolean isSafe(char[][] board,int row,int col,int n){
        //horizontal
        for(int j=0;j<n;j++){
            if(board[row][j] == 'Q'){
                return false;
            }
        }
        // Check column (only above)
    for(int i = 0; i < row; i++){
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
