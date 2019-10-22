package Classes;
import java.util.Random;

public class Cards {
	private String[] Terrain_types =  new String[]{"Terrain_1","Terrain_2","Terrain_3"};
	private String[] Food_type =  new String[]{"Berries" , "Fish", "Worms", "Small Animals", "Grain"};
	
	
	private int Random_number(int cap)	 // generates number from 0 - cap
	{
		Random rand = new Random();
		int number = rand.nextInt(cap+1);
		return number;
	}
	private String[] Bird_names =  new String[] {
			"Red-throated diver",
			"Black-throated diver",
			"Great northern diver",
			"Little grebe ",
			"Great-crested grebe",
			"Red-necked grebe",
			"Slavonian grebe",
			"Black-necked grebe",};
	private String Bird_name;
	private int Bird_point;
	private String Terrain_type ;
	private String Food_cost;
	public Cards()
	{
		Bird_name = Bird_names[Random_number(Bird_names.length - 1)];
		Bird_point = Random_number(9);
		Terrain_type = Terrain_types[Random_number(Terrain_types.length -1)];
		Food_cost = Food_type[Random_number(Food_type.length-1)];
	}
	
	public Cards(int terrain_index, int food_index)// to force terrain type
	{
		Bird_name = Bird_names[Random_number(Bird_names.length - 1)];
		Bird_point = Random_number(9);
		Terrain_type = Terrain_types[terrain_index];
		Food_cost = Food_type[food_index];
	}
	
	public String get_card_type()
	{
		return Terrain_type;
	}
	public void Display_card()
	{
		System.out.println("Bird Name: " + Bird_name);
		System.out.println("Bird Point: " + Bird_point);
		System.out.println("Bird Terrain: " + Terrain_type);
		System.out.println("Bird Food cost: " + Food_cost);
	}
	
	
}
