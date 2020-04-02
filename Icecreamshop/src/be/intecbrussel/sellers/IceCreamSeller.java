package be.intecbrussel.sellers;

import be.intecbrussel.eatables.Cone;
import be.intecbrussel.eatables.Flavor;
import be.intecbrussel.eatables.IceRocket;
import be.intecbrussel.eatables.Magnum;
import be.intecbrussel.eatables.MagnumType;

public interface IceCreamSeller extends Profitable{
	
	Cone orderCone(Flavor[] balls) ;
	IceRocket orderIceRocket() ;
	Magnum orderMagnum(MagnumType type) ;

}
