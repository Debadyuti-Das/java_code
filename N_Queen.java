
import java.util.*;
public class N_Queen {
       public boolean isSafe(int row,int col,char[][]board){
        //horizontal
        for(int j=0;j<board.length;j++){
            if(board[row][j]=='Q'){
                return false;
            }
        }
        //vertical 
        for(int i=0;i<board.length;i++){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //upper left
        int r=row;
        for(int c=col;c>=0 && r>=0; c--,r--){
            if(board[r][c]=='Q'){
                return false;
            }

        }
        //upper right
        r=row;
        for(int c=col;c<board.length && r>=0;r--,c++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower left
        r=row;
        for(int c=col;c>=0 && r<board.length;r++,c--){
            if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower right
        r=row;
        for(int c=col;c<board.length && r<board.length;c++,r++){
            if(board[r][c]=='Q'){
                return false;
            }
        }
              // Position is safe for placing a queen
        return true;
    }
    public void saveboard(char[][] board, List<List<String>> allboards){
        String row="";
        List<String>newboard=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q')
                    row +='Q';
                else
                    row +='.';
            }
            newboard.add(row);
        }
        allboards.add(newboard);
    }
       //For the backtracking part:
    public void helper(char[][] board, List<List<String>> allboards, int col){
            // Base case: all queens placed successfully
        if(col==board.length){
            saveboard(board,allboards);
            return;
        }
           // Try placing queen in every row of current column
        for (int row=0;row<board.length; row++){
                // Check if current position is safe
            if(isSafe(row,col,board)){
                   // Choose: place queen
                board[row][col]='Q';
                   // Explore: solve for next column
                helper(board,allboards,col+1);
                   // Unchoose (Backtrack): remove queen
                board[row][col]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n){
        List<List<String>> allboards =new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        helper(board,allboards,0);
        return allboards;
    }
       // Create object of N_Queen class
    public static void main(String[] args) {

        N_Queen obj = new N_Queen();

        int n = 4;

        List<List<String>> result = obj.solveNQueens(n);
// Print all valid solutions
        for (List<String> board : result) {
            System.out.println("Solution:");
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }  
}
