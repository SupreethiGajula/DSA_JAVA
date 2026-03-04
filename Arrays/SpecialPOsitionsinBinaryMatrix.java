// Given an m x n binary matrix mat, return the number of special positions in mat.

// A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] rowcount = new int[m];
        int [] colcount = new int[n];

        for(int i=0;i<m;i++){
            for(int j = 0;j<n ;j++){
                if(mat[i][j] == 1){
                    rowcount[i]++;
                    colcount[j]++;
                }
            }
        }
        int specialcount = 0;
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] == 1 && rowcount[i] == 1 && colcount[j] == 1){
                    specialcount++;
                }
            }
        }
        return specialcount;
        
    }
}
