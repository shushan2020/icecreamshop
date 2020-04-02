package be.intecbrussel.eatables;

public enum MagnumType {

	MILKCHOCOLATE(1.00), WHITECHOCOLATE(1.23), BLACKCHOCOLATE(1.2), ALPINENUTS(1.5), ROMANTICSTRAWBERRIES(1.4);

	private double price;

	private MagnumType(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

}
