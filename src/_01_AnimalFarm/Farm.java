package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		ArrayList <Animal> farm = new ArrayList <Animal>() ;
		
		Animal pig1 = new Pig();
		Animal pig2 = new Pig();
		Animal cow1 = new Cow();
		Animal cow2 = new Cow();
		Animal rooster = new Rooster();
		Animal sheep = new Sheep();
		
		farm.add(pig1);
		farm.add(pig2);
		farm.add(cow1);
		farm.add(cow2);
		farm.add(rooster);
		farm.add(sheep);
		
		for(int i = 0; i < farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).eat();
		}
	}
}
