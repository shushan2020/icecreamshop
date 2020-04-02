package be.intecbrussel.eatables;

import java.util.Arrays;

//import be.intecbrussel.eatables.Cone.Flavor;

public class Cone implements Eatable {

	private Flavor[] balls;

//	public enum Flavor {
//
//		STRAWBERRY, BANANA, CHOCOLATE, VANILLA, LEMON, STRACIATELLA, MOKKA, PISTACHE;
//		
//
//	}

	public Cone() {

	}

	public Cone(Flavor[] balls) {

		this.balls = balls;
		// balls=Flavor.values();

	}

	// Cone.Flavor flavor =Cone.Flavor.LEMON;

	public void eat() {

		System.out.println("you are eating " +Arrays.toString( balls));
//		switch (flavor) {
//		case STRAWBERRY:
//			System.out.println("STRAWBERRY");
//			break;
//		case BANANA:
//			System.out.println("BANANA");
//			break;
//		case CHOCOLATE:
//			System.out.println("CHOCOLATE");
//			break;
//		case VANILLA:
//			System.out.println("VANILLA");
//			break;
//		case LEMON:
//			System.out.println("LEMON");
//			break;
//		case STRACIATELLA:
//			System.out.println("STRACIATELLA");
//			break;
//		case MOKKA:
//			System.out.println("MOKKA");
//			break;
//		case PISTACHE:
//			System.out.println("PISTACHE");
//			break;
//		
//		}

	}
	

	public Flavor[] getBalls() {
		return balls;
	}

	
	@Override
	public String toString() {
		return "Cone [balls=" + Arrays.toString(balls) + "]";
	}

}
