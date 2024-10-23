package BackTracking;
//Place N Queens on an chessboard such that no 2 Queens can attack each other 
public class Problem4 {
    public static void nQueens(char board[][], int row ){
        if (row==board.length) {
            printBoard(board);
            return;
        }

        //colomn loop
        for(int j=0; j<board.length; j++){
            board[row][j]='Q';
            nQueens(board, row+1);
            board[row][j]='.';    //backtrack
        }
    }
    public static void printBoard(char board[][]){
        for(int i =0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 2;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        
    }
}
