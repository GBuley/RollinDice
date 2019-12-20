package dice;

import java.util.Random;

public class LoadedDie implements Rollable {
	final int sides = 6;
	final int fiftyfifty = 2;
	final Random rand = new Random();
	
	int loadedSide = 1;
	
	@Override
	public int roll() {
		int loaded = rand.nextInt(fiftyfifty);
		if(loaded == 0) {
			return loadedSide;
		}
		int side = rand.nextInt(sides)+1;
		return side;

	}

}
