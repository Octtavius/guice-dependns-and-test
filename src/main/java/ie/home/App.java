package ie.home;

import com.google.inject.Guice;
import com.google.inject.Injector;

import ie.home.modules.GeneralModule;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Injector injector = Guice.createInjector(new GeneralModule());
        
        Discountable discount = injector.getInstance(Discountable.class);
        
        System.out.println(discount.getDiscount());
    }
}
