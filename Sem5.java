// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.


public class Sem5 {
    public static void main(String[] args) {
        // Шахматная доска
        int[][] board = new int[8][8];
        placeQueens(board, 0);
    }

    public static void placeQueens(int[][] board, int col) {
        // расставим 8 ферзей
        if (col == 8) {
            printBoard(board);
            return;
        }
        for (int row = 0; row < 8; row++) {
            if (isSafe(board, row, col)) {
                // место королевы
                board[row][col] = 1;
                // пробуем следующий столбец
                placeQueens(board, col + 1);
                board[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] board, int row, int col) {
        // проверка предыдущих столбцов
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        // проверяем верхнюю диагональ
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        // проверяем нижнюю диагональ
        for (int i = row, j = col; i < 8 && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
