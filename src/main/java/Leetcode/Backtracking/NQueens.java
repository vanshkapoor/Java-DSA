package Leetcode.Backtracking;

public class NQueens {
//    int N=4;


    public static boolean isSafe(int[][] board, int row, int col)
    {
//        check if in same row
        for(int i=0; i<row ;i++)
        {
            if(board[i][col] == 1) return false;
        }

//        check if in left diagnol
        for(int i=row, j=col; i>=0 && j>=0; i--,j--)
        {
            if(board[i][j] == 1) return false;
        }

//        check if in right diagnol
        for(int i=row, j=col; i>=0 && j<4; i--,j++)
        {
            if(board[i][j] == 1) return false;
        }

        return true;
    }

    public static boolean NqueenUtils(int[][] board, int row)
    {
        if(row>4)
        {
            System.out.println(board);
            return true;
        }

        for(int i=0; i<4; i++)
        {
            if(isSafe(board, row, i))
            {
                board[row][i] = 1;

                if(NqueenUtils(board, row+1) == true)return true;

                board[row][i] = 0;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[][] board = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };


        NqueenUtils(board,0);

    }
}
