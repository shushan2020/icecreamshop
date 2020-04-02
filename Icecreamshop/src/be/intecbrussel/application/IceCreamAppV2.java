package be.intecbrussel.application;

import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV2 {

	public static void main(String[] args) {

		IceCreamSeller iceCreamCar = new IceCreamCar(new PriceList(1.2, 1.00, 1.25), new Stock(3, 4, 2, 5));
		iceCreamCar.orderIceRocket();
		iceCreamCar.orderIceRocket();
		iceCreamCar.orderIceRocket();
		iceCreamCar.orderIceRocket();

		System.out.println(iceCreamCar);

	}

}
