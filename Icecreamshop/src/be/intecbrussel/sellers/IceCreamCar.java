package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamCar implements IceCreamSeller {

	private PriceList priceList;
	private Stock stock;
	private double profit;

	public IceCreamCar(PriceList priceList) {

		this.priceList = priceList;
	}

	public IceCreamCar(PriceList priceList, Stock stock) {
		this.priceList = priceList;
		this.stock = stock;
	}

	@Override
	public Cone orderCone(Flavor[] balls) throws NoMoreIceCreamException {

		return prepareCone(balls);
	}

	private Cone prepareCone(Flavor[] balls) throws NoMoreIceCreamException {
		Cone Cone = new Cone(balls);

		if (stock.getCones() > 0 && stock.getBalls() > balls.length) {

			profit += priceList.getBallPrice() * balls.length;
			stock.setCones(stock.getCones() - 1);
			stock.setBalls(stock.getBalls() - 1);

		} else {
			throw new NoMoreIceCreamException("no more ice cream in the stock");
			// System.out.println("no more ice cream in the stock");
		}
		return Cone;
	}

	@Override
	public IceRocket orderIceRocket() throws NoMoreIceCreamException {

		return prepareRocket();
	}

	private IceRocket prepareRocket() throws NoMoreIceCreamException {
		IceRocket newIceRocket = new IceRocket();

		if (stock.getIceRockets() > 0) {
			profit += priceList.getRocketPrice();
			stock.setIceRockets(stock.getIceRockets() - 1);

		}

		else {
			throw new NoMoreIceCreamException("no more ice rocket in the stock");
			// System.out.println("no more ice rocket in the stock");
		}

		return newIceRocket;

	}

	@Override
	public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {

		return prepareMagnum(type);
	}

	private Magnum prepareMagnum(MagnumType type) throws NoMoreIceCreamException {
		Magnum magnum = new Magnum(type);

		if (stock.getMagni() > 0) {
			profit += priceList.getMagnumStandardPrice() * type.getPrice();
			stock.setMagni(stock.getMagni() - 1);
		} else {
			throw new NoMoreIceCreamException("no more magnum type in stock");
			// System.out.println("no more magnum type in stock");

		}

		return magnum;
	}

	@Override
	public double getprofit() {

		return profit;
	}

	@Override
	public String toString() {
		return "IceCreamCar [priceList=" + priceList + ", stock=" + stock + ", profit=" + profit + "]";
	}

}
