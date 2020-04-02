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
	public Cone orderCone(Flavor[] balls) {

		return prepareCone(balls);
	}

	private Cone prepareCone(Flavor[] balls)  {
		return null;
		
	}

	@Override
	public IceRocket orderIceRocket() {

		return prepareRocket();
	}

	private IceRocket prepareRocket() {
		return null;
		
	}

	@Override
	public Magnum orderMagnum(MagnumType type) {

		return prepareMagnum(type);
	}

	private Magnum prepareMagnum(MagnumType type)  {
		return null;
		
	}

	@Override
	public double getprofit() {

		return profit;
	}

}
