package cup;

import java.util.List;

import dice.Rollable;

public class Cup {
	List<Rollable> dice;
	public Cup(List<Rollable> dice) {
		this.dice = dice;
	}
	
	public int shake(){
		int sum = 0;

		for(int i=0; i < dice.size(); i++){
			sum += dice.get(i).roll();
		}
		return sum;
	}
	
	
}
