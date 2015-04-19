package com.magnus.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Playground {

	static int[][] instance;
	static boolean turn = true;

	public static void displayState() {
		System.out.println("   1  2  3");
		String[] vertical = {"A", "B", "C"};

		for(int i = 0; i < instance.length; i++) {
			List<Integer> row = new ArrayList<Integer>();
			for (int y : instance[i]) {
				row.add(y);
			}
			System.out.println(vertical[i] + " " + row);
		}
	}

	public static void main(String[] args) throws IOException  {
		instance = Board.getBoard();

		while(true) {
			displayState();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			if(turn) {
				System.out.print("Player 1 - enter move:");
			} else {
				System.out.print("Player 2 - enter move:");
			}

			String move = br.readLine();

			instance = Board.addMove(instance, move, turn);
			Game.computeWinner(instance);
			turn = !turn;
		}
	}

}
