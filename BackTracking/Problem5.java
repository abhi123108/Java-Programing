package BackTracking;
//find the total ways in which we can solve N queens 
public class Problem5 {
    public static boolean isSafe(char board[][], int row , int col){
        //vertical up
        for(int i=row-1; i>=0; i--){
            if (board[i][col]=='Q') {
                return false;
            }
        }
        //diag left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; j--,i--){
            if (board[i][j]=='Q') {
                return false;
            }
        }
        // diag right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++) {
            if (board[i][j]=='Q') {
            return false;
    }
}

        return true;
    }
    public static void nQueens(char board[][], int row ){
        if (row==board.length) {
            count++;
            return;
        }

        //colomn loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board , row , j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]= 'X';    //backtrack
            }
        }
    }
    public static void printBoard(char board[][]){
        System.out.println("--------chessboard---------");
        for(int i =0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }

    static int count=0; 
    public static void main(String[] args) {
        int n = 4;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='X';
            }
        }
        nQueens(board, 0);
        System.out.println("total ways to solve queens ="+ count);
    }
}

//Time Complexity=O(n!)
