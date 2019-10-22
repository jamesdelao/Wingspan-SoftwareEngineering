package Classes;

public class mechanics {
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
}
