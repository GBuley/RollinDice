package cup;

import java.util.ArrayList;
import java.util.List;

import dice.Die;
import dice.LoadedDie;
import dice.Rollable;
import cup.Cup;

public class Application {
	public static void main(String[] args) {
		Die die = new Die();
		LoadedDie loadedDie = new LoadedDie();
		List<Rollable> list = new ArrayList<>();

		for(int i = 0; i < 60; i++) {
			list.add(new Die());
			list.add(new LoadedDie());
		}
		
		System.out.println(die.roll());
		System.out.println(loadedDie.roll());
		Cup cup = new Cup(list);
		System.out.println(cup.shake());
		
		
	}
}
