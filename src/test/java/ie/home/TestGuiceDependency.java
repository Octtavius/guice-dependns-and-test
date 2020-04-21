package ie.home;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestGuiceDependency {

	@Mock
	Bonus bonus;
	
	@InjectMocks
	private NightDiscount nightDiscount;
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertNotNull(bonus);
		when(bonus.getBonus()).thenReturn(1.2);
		System.out.println(nightDiscount.getDiscount());
	}

}
