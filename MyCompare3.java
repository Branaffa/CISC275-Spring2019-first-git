package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MyCompare3 {
	
	public static void main(String[] args){
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Animal>(){
			@Override
			public int compare(Animal a, Animal b){
				int result = a.getName().compareTo(b.getName());
				if (result == 0) {
					result = a.getNumLegs() - b.getNumLegs();
				}
			    return result;
			}
		});
		System.out.println(dogs);
	}
}




