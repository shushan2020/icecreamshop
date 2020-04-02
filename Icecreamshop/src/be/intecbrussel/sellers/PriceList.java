package be.intecbrussel.sellers;

public class PriceList {

	private double ballPrice;
	private double rocketPrice;
	private double magnumStandardPrice;

	public PriceList() {
		this.magnumStandardPrice = 1.5;

	}

	public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
		this.ballPrice = ballPrice;
		this.rocketPrice = rocketPrice;
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public void setBallPrice(double ballPrice) {
		this.ballPrice = ballPrice;
	}

	public void setRocketPrice(double rocketPrice) {
		this.rocketPrice = rocketPrice;
	}

	public void setMagnumStandardPrice(double magnumStandardPrice) {
		this.magnumStandardPrice = magnumStandardPrice;
	}

	public double getBallPrice() {
		return ballPrice;
	}

	public double getRocketPrice() {
		return rocketPrice;
	}
	

//	public double getMagnumPrice(MagnumType type) {
//		double magnumPrice = magnumStandardPrice;
//		switch (type) {
//		case MILKCHOCOLATE:
//			magnumPrice*=;
//			break;
//		case BLACKCHOCOLATE:
//			magnumPrice*=1.2;
//			break;
//		case WHITECHOCOLATE:
//			magnumPrice*=1.25;
//			break;
//		case ALPINENUTS:
//			magnumPrice*=1.7;
//			break;
//		case ROMANTICSTRAWBERRIES:
//			magnumPrice*=1;
//			break;
//
//		
//		}
//		return magnumPrice;
//
//	}

	public double getMagnumStandardPrice() {
		return magnumStandardPrice;
	}

	@Override
	public String toString() {
		return "PriceList [ballPrice=" + ballPrice + ", rocketPrice=" + rocketPrice + ", magnumStandardPrice="
				+ magnumStandardPrice + "]";
	}
	

}
