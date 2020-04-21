package ie.home;

import com.google.inject.Inject;

public class NightDiscount implements Discountable{

	@Inject
	private Bonus bonus;
	
	public NightDiscount() {}
	
	public double getDiscount() {
		System.out.println("bonus: " + bonus.getBonus());
		return 0.35;
	}
}
