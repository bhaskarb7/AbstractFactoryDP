package bathula.example.afactory.impl;

import bathula.example.afactory.AnimalFactory;
import bathula.example.dp.Animal;
import bathula.example.dp.impl.Cow;
import bathula.example.dp.impl.Dog;
import bathula.example.dp.impl.Lion;
import bathula.example.dp.impl.Tiger;

public class WildLandAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimal(String animalType) throws Exception {
		 switch(animalType){
			case "lion":
				return new Lion();
				
			case "tiger":
				return new Tiger();
				
			default:
				throw new Exception("invalid land wild animal type:"+animalType);
			

			}

	}

}
