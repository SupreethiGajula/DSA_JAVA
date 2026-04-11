import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NQueens {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        List<List<String>> res = new ArrayList<>();
        int rows = sc.nextInt();
        int cols = rows;
        char[][] board = new char[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                board[i][j] = '.';
            }
        }
        getNQueens(res,board,rows,0);
        System.out.println(res);
    }
    private static void getNQueens(List<List<String>> res,char[][] board,int rows,int idx){
        if(idx==rows){
            res.add(constructBoard(board));
            return;
        }
        //this loop is iterating in for each col as it is an nxn matrix rows=cols
        for(int j=0;j<rows;j++){
        if(isSafe(board,idx,j)){
            board[idx][j] = 'Q';
            getNQueens(res, board, rows, idx+1);
            board[idx][j] = '.';
        }
    }
    }
    private static boolean isSafe(char[][] board, int row, int col) {
    // upper column
    for (int i = 0; i < row; i++) {
        if (board[i][col] == 'Q') {
            return false;
        }
    }
    //upper left diagonal
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
        if (board[i][j] == 'Q') {
            return false;
        }
    }
    //upper right diagonal
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
        if (board[i][j] == 'Q') {
            return false;
        }
    }

    return true;
}
    private static List<String> constructBoard(char [][] board){
        List<String> s = new ArrayList<>();
        for(int i = 0;i<board.length;i++){
            String temp = new String(board[i]);
            s.add(temp);
        }
        return s;
    }
    
}
