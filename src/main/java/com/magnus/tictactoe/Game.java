package com.magnus.tictactoe;

public class Game {

	public static boolean checkCases(int[][] instance, Integer player) {
		boolean result = false;

		// vertical 1
		if(player.equals(instance[0][0]) && player.equals(instance[1][0]) && player.equals(instance[2][0])) {
			result = true;
		}

		// vertical 2
		if(player.equals(instance[0][1]) && player.equals(instance[1][1]) && player.equals(instance[2][1])) {
			result = true;
		}

		// vertical 3
		if(player.equals(instance[0][2]) && player.equals(instance[1][2]) && player.equals(instance[2][2])) {
			result = true;
		}

		// horizontal A
		if(player.equals(instance[0][0]) && player.equals(instance[0][1]) && player.equals(instance[0][2])) {
			result = true;
		}

		// horizontal B
		if(player.equals(instance[1][0]) && player.equals(instance[1][1]) && player.equals(instance[1][2])) {
			result = true;
		}

		// horizontal C
		if(player.equals(instance[2][0]) && player.equals(instance[2][1]) && player.equals(instance[2][2])) {
			result = true;
		}

		// diagonal 1
		if(player.equals(instance[0][0]) && player.equals(instance[1][1]) && player.equals(instance[2][2])) {
			result = true;
		}

		// diagonal 2
		if(player.equals(instance[2][0]) && player.equals(instance[1][1]) && player.equals(instance[0][2])) {
			result = true;
		}
		return result;
	}

	public static void computeWinner(int[][] instance) {
		boolean win1 = checkCases(instance, 1);
		boolean win2 = checkCases(instance, 2);

		if(win1) {
			System.out.println("Player 1 wins!");
			System.exit(0);
		} else if(win2) {
			System.out.println("Player 2 wins!");
			System.exit(0);
		}
	}

}
