package dice;
import java.util.Random;

public class Die implements Rollable{
	final int sides = 6;
	Random rand = new Random();
	
	@Override
	public int roll() {
		int side;
		side = rand.nextInt(sides) +1;
		return side;
	}
}
