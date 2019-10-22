package Classes;

public class Player_board {
	Board_tile[] first = new Board_tile[5];
	Board_tile[] second = new Board_tile[5];
	Board_tile[] third = new Board_tile[5];
	Board_tile[][] board = new Board_tile[3][5];
	

	public Player_board()
	{
		for(int i = 0;i<5;i++)
		{
			first[i] = new Board_tile(0);
			second[i] = new Board_tile(1);
			third[i] = new Board_tile(2);
		}
		board[0] = first;
		board[1] = second;
		board[2] = third;
		
	}
	public Player_board(int index)
	{
		for(int i = 0;i<5;i++)
		{
			first[i] = new Board_tile(index);
			second[i] = new Board_tile(index);
			third[i] = new Board_tile(index);
		}
		board[0] = first;
		board[1] = second;
		board[2] = third;
		
	}
	public void display_board()
	{
		for(int i = 0;i<5;i++)
		{
			first[i].display_tile();
		}
		for(int i = 0;i<5;i++)
		{
			second[i].display_tile();
		}
		for(int i = 0;i<5;i++)
		{
			third[i].display_tile();
		}

	}
}
