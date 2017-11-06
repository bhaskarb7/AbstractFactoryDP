package bathula.example.afactory.impl;

import bathula.example.afactory.AnimalFactory;
import bathula.example.dp.Animal;
import bathula.example.dp.impl.Cow;
import bathula.example.dp.impl.Dog;
import bathula.example.dp.impl.Duck;
import bathula.example.dp.impl.Seal;

public class DomesticLandAnimalFactory extends AnimalFactory {

	@Override
	public Animal getAnimal(String animalType) throws Exception {
		 switch(animalType){
			case "dog":
				return new Dog();
				
			case "cow":
				return new Cow();
				
			default:
				throw new Exception("invalid domestic land animal type:"+animalType);
			

			}
		}


}
