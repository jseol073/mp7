package tictactoe;

public class TicTacToe {
	static char[][] board= new char[3][3];
	public static Evaluation evaluateBoard(String states) {
		reset(board);
		if (states.length() != 9) {
			return Evaluation.InvalidInput;
		} else {
			fill(states, board);
		}
		
		return null;
	}
	private static void reset(char[][] board) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = ' ';
            }
    }
	private static void fill(String states, char[][] board) {
            for (int i = 0; i < 9; ++i) {
                board[i/3][i%3] = states.charAt(i);
            }
    }
}
