package com.brad.exercises.chapter8_multi_dimensional_arrays;

import java.util.Scanner;

public class Exercise9_TicTacToe {
	
	private static char[][] board = new char[3][3];
	private static int turn = 1;
	private static Scanner input = new Scanner(System.in);
	private static String winner = "";

	public static void main(String[] args) {
		
		// display initial board
		
		System.out.println("Tic-Tac-Toe");
		displayBoard(board);
		
		do {
			
			// prompt user to enter a token
			enterToken();
			
			// redisplay board
			displayBoard(board);
			
			// change to other player's turn
			turn = changeTurn(turn);
		}
		
		// determine status of game (win, lose, or draw)
		while(!endOfGame());
		
		// display conclusion
		System.out.println("The winner is " + winner + " !");
		
	}
	
	// display the board
	public static void displayBoard(char[][] board) {
		
		System.out.println("----------");
		for(int i = 0; i < board.length; i++) {
			System.out.print("|");
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " |");
			}
			System.out.println();
			System.out.println("----------");
		}
	}
	
	// prompt the user for a token location
	public static int[] promptTokenLocation() {
		int row, column;
		
		System.out.printf("Enter a row (0, 1, 2) for player %d: ", turn);
		row = input.nextInt();
		
		System.out.println();
		
		System.out.printf("Enter a column (0, 1, 2) for player %d: ", turn);
		column = input.nextInt();
		
		return new int[] {row, column};
	}
	
	
	// save a token to a selected location
	public static void enterToken() {
		int[] location;
		int row, column;
		
		do {
			location = promptTokenLocation();
			row = location[0];
		    column = location[1];
			
			if(board[row][column] == '\u0000') {
				if(turn == 1) {
					board[row][column] = 'X';
				}
				else {
					board[row][column] = 'O';
				}
				break;
			}
			else {
				System.out.println("Invalid location");			
			}
		}
		while(board[row][column] != '\u0000');
	}
	
	public static int changeTurn(int currentTurn) {
		
		if(currentTurn == 1) {
			return 2;
		}
		else {
			return 1;
		}
	}

	public static boolean endOfGame() {
		char[] tokens = {'X', 'O'};
		
		for(int i = 0; i < tokens.length; i++) {
		
			if(board[0][0] == tokens[i] && board[0][1] == tokens[i] && board[0][2] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
			else if(board[1][0] == tokens[i] && board[1][1] == tokens[i] && board[1][2] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
			else if(board[2][0] == tokens[i] && board[2][1] == tokens[i] && board[2][2] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
			else if(board[0][0] == tokens[i] && board[1][0] == tokens[i] && board[2][0] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
			else if(board[0][1] == tokens[i] && board[1][1] == tokens[i] && board[2][2] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
			else if(board[0][2] == tokens[i] && board[1][2] == tokens[i] && board[2][2] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
			else if(board[0][0] == tokens[i] && board[1][1] == tokens[i] && board[2][2] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
			else if(board[0][2] == tokens[i] && board[1][1] == tokens[i] && board[2][0] == tokens[i]) {
				setWinner(tokens[i]);
				return true;
			}
		}
		return false;
	}
	
	public static void setWinner(char token) {
		if(token == 'X') {
			winner = "player 1";
		}
		else if(token == 'O') {
			winner = "player 2";
		}			
	}
}
