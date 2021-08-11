package com.bridgelabz.SAL;

public class SnakeAndLadder {
	public static final int max_dice = 6, min_dice = 1;
	public static void main(String[] args) {
		int game_set[] = new int[100];
		int position=0,dice_result;
		System.out.println("Welcome to Snake And Ladder Game");
		dice_result = (int) (Math.random()*(max_dice - min_dice + 1) + min_dice);
		System.out.println("Your number after rolling the dice :- " + dice_result);
		
	}

}
