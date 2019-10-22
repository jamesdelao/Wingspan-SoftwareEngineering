package Classes;

import java.util.Random;

public class Board_tile {
	private String[] Terrain_types =  new String[]{"Terrain_1","Terrain_2","Terrain_3"};
	private String Tile_type;
	Cards card = new Cards();
	private int Random_number(int cap)
	{
		Random rand = new Random();
		int number = rand.nextInt(cap+1);
		return number;
	}
	public Board_tile()
	{
		Tile_type = (Terrain_types[Random_number(Terrain_types.length-1)]);
	}
	public Board_tile(int index)//to force terrain type
	{
		Tile_type = (Terrain_types[index]);
	}
	public String get_tile_type()
	{
		return Tile_type;
	}
	public void display_tile()
	{
		System.out.println(Tile_type);
	}
}
