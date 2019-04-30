package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainAnimalRunner {

	public static void main(String[] args) {

		Animal dog1 = new Animal("Tom", 4);
		Animal dog2 = new Animal("Biscuit", 4);
		Animal dog3 = new Animal("Cookies", 4);
		Animal dog4 = new Animal("Cookies", 4);
		Animal dog5 = new Animal("Biscuits", 4);
		
		// List for all the dogs
		ArrayList<Animal> dogList= new ArrayList<Animal>(Arrays.asList(dog1, dog2, dog3, dog4, dog5));

		// Arrays[] pet1 = {dog2, dog2};
		ArrayList<Animal> myPet = new ArrayList<Animal>(Arrays.asList(dog2, dog3));
		
		for (Animal animal : myPet) {
			System.out.println(animal.name);
		}

		String animalName = "Cookies";
		
		ArrayList<Animal> aList = new ArrayList<Animal>();
		
		
		for (int i = myPet.size()-1; i >= 0; i--) {
			if (!myPet.get(i).name.equals(animalName)) {
				continue;

			} else {
			
				System.out.println("Size before removal: " +myPet.size());
				myPet.remove(myPet.get(i)); // removing 
				//aList.add(myPet.get(i));
				
				// System.out.println("No Dog with :" + animalName);
			}
		}
		//System.out.println("No.of Dog found with name: " + animalName + "  is: " + aList.size());
		System.out.println("No.of myPet is :" + myPet.size());
		//create an arryList for nonDuplicate
		ArrayList<Animal> distinct = new ArrayList<Animal>();
		
		for(int i =0; i<dogList.size(); i++) {
			for(int j=0; j<distinct.size(); j++) {
				String dAnimal = null;
				dAnimal = dogList.get(i).name;
				distinct.get(i).name = dAnimal;
				
				if(!dogList.get(i).name.equals(distinct.get(i).name)) {
					distinct.add(dogList.get(i));
				}
			}
		}
		System.out.println("No.of distinct is: " +distinct.size());
		
		for(Animal thisDog: distinct) {
			System.out.println(thisDog.name);
		}
		
//		System.out.println("Here is our available dogs: ");
//		for(Animal dog: dogList) {
//			System.out.println(dog.name);
//		}
	}
}
