public class Solution {
    // Checks whether a number can be placed safely at board[row][col]
    public boolean isSafe(char[][]board,int row,int col,int number){

        //row&column
        for(int i=0;i<board.length;i++){
             // If number already exists in the column
            if(board[i][col]==(char)(number + '0')){
                return false;
            }
             // If number already exists in the row
            if(board[row][i]==(char)(number +'0')){
                return false;
            }
        }
        // Find starting row of the 3x3 subgrid
        int sr=(row/3)*3;
         // Find starting column of the 3x3 subgrid
        int sc=(col/3)*3;
          // Traverse the 3x3 subgrid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                  // If number already exists in the subgrid
                if(board[i][j]==(char)(number +'0')){
                    return false;
                }
            }
        }
         // Safe to place the number
        return true;
    }
    // Recursive function to solve Sudoku using backtracking
        public boolean helper(char[][]board,int row,int col){
             // Base case: all rows processed, Sudoku solved
        if(row==board.length){
            return true;
        }

        // Variables to store next cell position
        int nrow=0;
        int ncol=0;
          // Move to next column if not at end of row
        if(col !=board.length-1){
            nrow=row;
            ncol=col+1;
             // Move to first column of next row
        }else{
            nrow=row+1;
            ncol=0;
        }
         // If current cell already contains a number
        if(board[row][col]!='.'){
            // Move directly to next cell
            if(helper(board, nrow, ncol)){
                return true;
            }
            // Empty cell found
        }else{
            // Try digits 1 to 9
            for(int i=1;i<=9;i++){
                 // Check if digit can be placed
                if(isSafe(board,row,col,i)){
                     // Place the digit
                    board[row][col]=(char)(i+'0');
                     // Recursively solve remaining board
                    if(helper(board, nrow, ncol)){
                        return true;
                    }else{
                         // Backtrack: remove placed digit
                        board[row][col]='.';
                    }
                }
            }
        }
          // No valid solution found from this state
        return false;
    }
    // Main function called by the driver code
    public void solveSudoku(char[][]board){
        // Start solving from top-left cell
        helper(board, 0, 0);
    }
    public static void main(String[] args) {
       char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        }; 
         Solution s = new Solution();
        s.solveSudoku(board);

        for (char[] row : board) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
    
