package be.intecbrussel.sellers;


import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public class IceCreamSalon implements IceCreamSeller {
	private PriceList priceList;
	private double totalProfit;

	public IceCreamSalon(PriceList priceList) {
		
		this.priceList=priceList;
	}

//	public double getProfit() {
//		return totalProfit;
//
//	}

	@Override
	public Cone orderCone(Flavor[] balls) {
		
		Cone Cone = new Cone(balls);
		
		totalProfit += priceList.getBallPrice();

		return Cone;
	}

	@Override
	public IceRocket orderIceRocket() {
		IceRocket newIceRocket = new IceRocket();
		totalProfit += priceList.getRocketPrice();
		return newIceRocket;
	}

	@Override
	public Magnum orderMagnum(MagnumType type) {
		Magnum magnum = new Magnum(type);
		totalProfit += priceList.getMagnumStandardPrice()*type.getPrice();
		return magnum;
	}

	@Override
	public double getprofit() {
		return totalProfit;
	}

	@Override
	public String toString() {
		return "IceCreamSalon [priceList=" + priceList + ", totalProfit=" + totalProfit + "]";
	}

	

	

}
