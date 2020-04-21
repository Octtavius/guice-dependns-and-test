package ie.home.modules;

import com.google.inject.AbstractModule;

import ie.home.Bonus;
import ie.home.Discountable;
import ie.home.NightDiscount;
import ie.home.SpecialBonus;

public class GeneralModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(Discountable.class).to(NightDiscount.class);
		bind(Bonus.class).to(SpecialBonus.class);
	}

}
