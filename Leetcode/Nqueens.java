
import java.util.ArrayList;
import java.util.List;

// Main class for solving N-Queens
public class Nqueens {

    // Method to check if placing a queen is safe
    public boolean isSafe(int row, int col, char[][] board) {
        int n = board.length;

        // Check horizontal (row)
        for (int j = 0; j < n; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // Check vertical (column)
        for (int i = 0; i < n; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower-left diagonal
        for (int r = row, c = col; r < n && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // Check lower-right diagonal
        for (int r = row, c = col; r < n && c < n; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Method to save the board configuration
    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < board[0].length; j++) {
                row.append(board[i][j] == 'Q' ? 'Q' : '.');
            }
            newBoard.add(row.toString());
        }

        allBoards.add(newBoard);
    }

    // Backtracking helper method
    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    // Main method to solve N-Queens
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    // Optional: for testing purpose
    public static void main(String[] args) {
        NQueens solver = new NQueens();
        int n = 4;
        List<List<String>> solutions = solver.solveNQueens(n);

        for (List<String> board : solutions) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
