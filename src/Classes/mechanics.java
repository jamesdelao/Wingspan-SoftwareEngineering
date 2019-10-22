package Classes;

import java.util.Scanner;

public class mechanics {
	
	public int choice;
	public void play_card(Player_board board, Cards card, int row,int column)
	{
		if(board.board[row][column].get_tile_type() == card.get_card_type())
		{
			System.out.print("Card is played");
			board.board[row][column].card = card;
		}else
		{
			System.out.print("Card cannot be played");
		}
	}
	public void game_menu() {
		
		System.out.println("Welcome to Wingspan");
		System.out.println("Please enter the number to select option");
		System.out.println("1.Start the game");
		System.out.println("2.Quit");
		Scanner scan = new Scanner (System.in);
		choice=Integer.parseInt(scan.nextLine());
		switch(choice)
		{
		case 1: start_game();
		case 2: System.exit(0);
		}
	}
	
	public Cards[] start_game() {
		//call 3 cards.
		Cards[] cards_test=new Cards[3]; 
		for(int x=0;x<3;x++) {
			
			cards_test[x] = new Cards();
		}
		for(int x=0;x<3;x++) {
			
			cards_test[x].Display_card();
		}
		return cards_test;
	}

	
}


