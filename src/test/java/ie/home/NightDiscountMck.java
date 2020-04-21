package ie.home;

import com.google.inject.Inject;

public class NightDiscountMck implements Discountable{
	
	public double getDiscount() {
		System.out.println("Testing service");
		return -1.1;
	}

}
