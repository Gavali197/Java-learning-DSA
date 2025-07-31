package Leetcode;

public class Sudoku {

    public boolean isSafe(char board[][], int row, int col, int number) {
        //column ke liye
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
        }

        // row ke liye
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == (char) (number + '0')) {
                return false;
            }
        }

        //grid ke liye
        int sr = 3 * (row / 3);
        int sc = 3 * (col / 3);

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }

        return true;

    }

    public boolean helper(char board[][], int row, int col) {
        if (row == board.length) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        if (col == board.length - 1) {
            nrow = row + 1;
            ncol = 0;
        } else {
            nrow = row;
            ncol = col + 1;
        }

        // If the current cell is already filled, move to the next one
        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        }

        // Try filling numbers from 1 to 9
        for (int i = 1; i <= 9; i++) {
            if (isSafe(board, row, col, i)) {
                board[row][col] = (char) (i + '0');  // Place the number

                if (helper(board, nrow, ncol)) {  // Recursive call
                    return true;
                }

                board[row][col] = '.'; // Backtrack
            }
        }

        return false; // No valid number found
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}
