import java.util.Scanner;
public class TicTacToeWinner {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
     String   boardPattern=scan.next();

        if (boardPattern.length() != 9) {
            System.out.println("Invalid board input. Must be exactly 9 characters.");
            return;
        }

        char winner = checkWinner(boardPattern);

        if (winner == 'X' || winner == 'O') {
            System.out.println("Winner: " + winner);
        } else {
            System.out.println("It's a draw!");
        }
    }

    public static char checkWinner(String board) {
        char[][] grid = new char[3][3];

        for (int i = 0; i < 9; i++) {
            grid[i / 3][i % 3] = board.charAt(i);
        }

        for (int i = 0; i < 3; i++) {

            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != ' ') {
                return grid[i][0];
            }

            if (grid[0][i] == grid[1][i] && grid[1][i] == grid[2][i] && grid[0][i] != ' ') {
                return grid[0][i];
            }
        }

        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != ' ') {
            return grid[0][0];
        }
        if (grid[0][2] == grid[1][1] && grid[1][1] == grid[2][0] && grid[0][2] != ' ') {
            return grid[0][2];
        }

        return ' ';
    }
}
