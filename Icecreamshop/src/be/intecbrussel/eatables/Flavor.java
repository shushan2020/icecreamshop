package be.intecbrussel.eatables;

public enum Flavor {

	STRAWBERRY(1.2), BANANA(1.00), CHOCOLATE(1.3), VANILLA(1.25), LEMON(1.0), STRACIATELLA(1.24), MOKKA(1.6),
	PISTACHE(1.9);

	private double price;

	private Flavor(double price) {
		this.price = price;

	}

	public double getPrice() {
		return price;
	}

}
