package be.intecbrussel.application;

import java.util.Arrays;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Eatable;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;
import be.intecbrussel.sellers.IceCreamCar;
import be.intecbrussel.sellers.IceCreamSalon;
import be.intecbrussel.sellers.IceCreamSeller;
import be.intecbrussel.sellers.NoMoreIceCreamException;
import be.intecbrussel.sellers.PriceList;
import be.intecbrussel.sellers.Stock;

public class IceCreamAppV1 {

	public static void main(String[] args) throws NoMoreIceCreamException {

		PriceList priceList = new PriceList(2, 3, 2.24);

		IceCreamSeller iceCreamSalon = new IceCreamSalon(priceList);

		Eatable[] iceCreamEatable = new Eatable[] { new Magnum(MagnumType.MILKCHOCOLATE),
				new Magnum(MagnumType.ALPINENUTS), new Magnum(MagnumType.BLACKCHOCOLATE),
				new Magnum(MagnumType.ROMANTICSTRAWBERRIES), new Magnum(MagnumType.WHITECHOCOLATE),
				new Cone(new Flavor[] { Flavor.STRACIATELLA, Flavor.PISTACHE, Flavor.LEMON }), new IceRocket() };

		System.out.println(Arrays.toString(iceCreamEatable));
		Eatable[] iceCream = new Eatable[] { new Magnum(MagnumType.BLACKCHOCOLATE),
				new Magnum(MagnumType.ROMANTICSTRAWBERRIES), new Cone(new Flavor[] { Flavor.PISTACHE, Flavor.BANANA }),
				new IceRocket() };

		for (Eatable orders : iceCream) {
			if (orders instanceof Cone) {
				iceCreamSalon.orderCone(((Cone) orders).getBalls());
				orders.eat();
			} else if (orders instanceof Magnum) {
				iceCreamSalon.orderMagnum(((Magnum) orders).getType());
				orders.eat();
			} else if (orders instanceof IceRocket) {
				iceCreamSalon.orderIceRocket();
				orders.eat();

			}
		}

		System.out.println("your order is : " + Arrays.toString(iceCream) + "\n\nyour price is : " + priceList
				+ iceCreamSalon.getprofit());

	}
}
