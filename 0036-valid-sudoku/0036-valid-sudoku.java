class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] != '.'){
                    char temp = board[i][j];
                    board[i][j] = '.';
                    if(!isValid(board,i,j,temp)) return false;
                    board[i][j] = temp;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board,int r,int c,int k){
        int n = board.length;
        for(int i=0;i<n;i++){
            if(board[i][c] == k) return false;
            if(board[r][i] == k) return false;
            if(board[3*(r/3)+i/3][3*(c/3)+i%3] == k) return false;

        }
        return true;
    }
}