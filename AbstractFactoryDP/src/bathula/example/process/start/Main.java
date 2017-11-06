package bathula.example.process.start;

import bathula.example.afactory.AnimalFactory;
import bathula.example.afactory.impl.DomesticLandAnimalFactory;
import bathula.example.afactory.impl.SeaAnimalFactory;
import bathula.example.afactory.impl.WildLandAnimalFactory;

public class Main {

	public static void main(String[] args) {
        try {
			SeaAnimalFactory saf = (SeaAnimalFactory) AnimalFactory.createAnimalFactory("sea");
	        DomesticLandAnimalFactory dlaf = (DomesticLandAnimalFactory) AnimalFactory.createAnimalFactory("domestic");
	        WildLandAnimalFactory wlaf = (WildLandAnimalFactory) AnimalFactory.createAnimalFactory("wild");

	        
	        System.out.println(saf.getAnimal("duck").speak());
	        System.out.println(saf.getAnimal("seal").speak());

	        System.out.println(dlaf.getAnimal("cow").speak());
	        System.out.println(dlaf.getAnimal("dog").speak());
	        
	        System.out.println(wlaf.getAnimal("lion").speak());
	        System.out.println(wlaf.getAnimal("tiger").speak());

       
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
