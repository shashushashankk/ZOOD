package Login;

public class SudokuSolver {
    private static final int GRID_SIZE = 9;

    public static boolean solveSudoku(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                if (board[row][col] == 0) { // Find an empty cell
                    for (int num = 1; num <= GRID_SIZE; num++) { // Try numbers 1 to 9
                        if (isValidPlacement(board, num, row, col)) {
                            board[row][col] = num; // Place the number

                            if (solveSudoku(board)) { // Recursive call
                                return true; // If it leads to a solution, return true
                            }

                            board[row][col] = 0; // Backtrack
                        }
                    }
                    return false; // If no number works, return false
                }
            }
        }
        return true; // Solved
    }

    private static boolean isValidPlacement(int[][] board, int num, int row, int col) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == num || board[i][col] == num ||
                    board[row / 3 * 3 + i / 3][col / 3 * 3 + i % 3] == num) {
                return false; // Conflict found
            }
        }
        return true; // No conflict
    }

    public static void printBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int col = 0; col < GRID_SIZE; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}