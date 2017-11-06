package bathula.example.afactory;

import bathula.example.afactory.impl.DomesticLandAnimalFactory;
import bathula.example.afactory.impl.SeaAnimalFactory;
import bathula.example.afactory.impl.WildLandAnimalFactory;
import bathula.example.dp.Animal;

public abstract class AnimalFactory {

	
	abstract public Animal getAnimal(String animalType) throws Exception;
	
	public static AnimalFactory createAnimalFactory(String animalType) throws Exception{
		
		switch(animalType){
		
		case "sea":
			return new SeaAnimalFactory();
			
		case "domestic":
			return new DomesticLandAnimalFactory();
			
		case "wild":
			return new WildLandAnimalFactory();
			
		default:
			throw new Exception("invalid animal type:"+animalType);
		
			

		}
	}
}
