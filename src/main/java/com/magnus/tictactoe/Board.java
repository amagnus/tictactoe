package com.magnus.tictactoe;

public class Board {

	private static int[][] instance;

	public static int[][] getBoard() {
		instance = new int[][] { {0, 0, 0}, {0, 0, 0}, {0, 0, 0} };
		return instance;
	}

	public static int[][] addMove(int[][] board, String move, boolean turn) {
		instance = board;
		int moveValue = turn ? 1 : 2;

		switch(move) {
		case "A1":
			instance[0][0] = moveValue;
			break;
		case "A2":
			instance[0][1] = moveValue;
			break;
		case "A3":
			instance[0][2] = moveValue;
			break;
		case "B1":
			instance[1][0] = moveValue;
			break;
		case "B2":
			instance[1][1] = moveValue;
			break;
		case "B3":
			instance[1][2] = moveValue;
			break;
		case "C1":
			instance[2][0] = moveValue;
			break;
		case "C2":
			instance[2][1] = moveValue;
			break;
		case "C3":
			instance[2][2] = moveValue;
			break;
		}
		return instance;
	}

}
