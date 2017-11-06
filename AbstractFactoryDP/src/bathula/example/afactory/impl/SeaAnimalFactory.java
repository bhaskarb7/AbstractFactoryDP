package bathula.example.afactory.impl;

import bathula.example.afactory.AnimalFactory;
import bathula.example.dp.Animal;
import bathula.example.dp.impl.Duck;
import bathula.example.dp.impl.Seal;

public class SeaAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimal(String animalType) throws Exception {
      switch(animalType){
		
		case "duck":
			return new Duck();
			
		case "seal":
			return new Seal();
			
		default:
			throw new Exception("invalid sea animal type:"+animalType);
		

		}
	}

}
