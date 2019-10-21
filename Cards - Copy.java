package Classes;
import java.util.Random;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Cards {
	private int Random_number(int cap)	 // generates number from 0 - cap
	{
		Random rand = new Random();
		int number = rand.nextInt(cap+1);
		return number;
	}
	private String[] Terrain_types =  new String[]{"Terrain_1","Terrain_2","Terrain_3"};
	public class Read_bird_names {

		File f = new File("src/Names.txt");
		String ReadLine = "";

		BufferedReader b = new BufferedReader(new FileReader(f));
 
        while ((ReadLine = b.readLine()) != null) {
            System.out.println(ReadLine);
        }
	        } 
	    
	}
	
	
	private String Bird_name;
	private int Bird_point;
	private String Terrain_type ;
	private String Food_cost;
	public Cards()
	{
		Bird_name = "NULL";
		Bird_point = 0;
		Terrain_type = "NULL";
		Food_cost = "NULL";
	}
	public Cards(String Bird_name_)
	{
		Bird_name = Bird_name_;
		Bird_point = Random_number(9);
		Terrain_type = Terrain_types[Random_number(2)];
		Food_cost = "NULL";
	}
	public void Display_card()
	{
		System.out.println("Bird Name: " + Bird_name);
		System.out.println("Bird Point: " + Bird_point);
		System.out.println("Bird Terrain: " + Terrain_type);
		System.out.println("Bird Food cost: " + Food_cost);
	}
	
	
}
