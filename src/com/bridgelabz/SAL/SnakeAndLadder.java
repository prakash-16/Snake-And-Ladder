package com.bridgelabz.SAL;

public class SnakeAndLadder {
	public static final int max_dice = 6, min_dice = 1,pos_max=1,pos_min=3;
	public static void main(String[] args) {
		int game_set[] = new int[100];
		int position=0,dice_result,pos_result,new_pos;
		System.out.println("Welcome to Snake And Ladder Game");
		dice_result = (int) (Math.random()*(max_dice - min_dice + 1) + min_dice);
		System.out.println("Your number after rolling the dice :- " + dice_result);
		pos_result = (int) (Math.random()*(pos_max - pos_min + 1) + pos_min);
		if(pos_result == 1) {
			System.out.println("No Play");
			new_pos = position;
		}
		else if(pos_result == 2){
			System.out.println("Move ahead");
			new_pos = position + dice_result;
		}
		else if(pos_result == 3){
			if(position != 0) {
				System.out.println("Move behind");
			    new_pos = position + dice_result;
			}
			else {
				System.out.println("your are on start play again");
			}
		}
	}

}
