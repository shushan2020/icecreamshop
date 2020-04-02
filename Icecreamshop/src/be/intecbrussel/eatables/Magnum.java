package be.intecbrussel.eatables;

public class Magnum implements Eatable {

	private MagnumType type;

//	public enum MagnumType {
//
//		MILKCHOCOLATE, WHITECHOCOLATE, BLACKCHOCOLATE, ALPINENUTS, ROMANTICSTRAWBERRIES;
//
//	}

	public Magnum() {

	}

	public Magnum(MagnumType type) {
		this.type = type;
	}
	// Magnum.MagnumType magnumType = Magnum.MagnumType.MILKCHOCOLATE;

	@Override
	public void eat() {

		System.out.println("you eating " + type);

		// MagnumType type = MagnumType.MILKCHOCOLATE;
//		switch (type) {
//		case MILKCHOCOLATE:
//			System.out.println("you choose MILKCHOCOLATE");
//			break;
//		case WHITECHOCOLATE:
//			System.out.println("you choose WHITECHOCOLATE ");
//			break;
//		case BLACKCHOCOLATE:
//			System.out.println("you choose BLACKCHOCOLATE");
//			break;
//		case ALPINENUTS:
//			System.out.println("you choose ALPINENUTS");
//			break;
//		case ROMANTICSTRAWBERRIES:
//			System.out.println("you choose ROMANTICSTRAWBERRIES");
//			break;
//		
//		}
	}

	public MagnumType getType() {
		return type;
	}

	@Override
	public String toString() {
		return "Magnum [type=" + type  + "]";
	}
	

}
