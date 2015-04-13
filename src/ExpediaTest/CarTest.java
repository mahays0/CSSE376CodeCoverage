package ExpediaTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Expedia.Car;

public class CarTest {

	private Car targetCar;

	@Before
			public void TestInitialize()
			{
				targetCar = new Car(5);
			}
			
			@Test
			public void TestThatCarInitializes()
			{
				Assert.assertNotNull(targetCar);
			}	
			
			@Test
			public void TestThatCarHasCorrectBasePriceForFiveDays()
			{
				Assert.assertEquals(50, targetCar.getBasePrice()	, 0.0001);
			}
			
			@Test
			public void TestThatCarHasCorrectBasePriceForTenDays()
			{
				Car target = new Car(10);
				Assert.assertEquals(80, target.getBasePrice(), 0.0001);	
			}
			
			@Test
			public void TestThatCarHasCorrectBasePriceForSevenDays()
			{
				Car target = new Car(7);
				Assert.assertEquals(10*7*.8, target.getBasePrice(), 0.0001);
			}
			
			@Test(expected=RuntimeException.class)
			//[ExpectedException(typeof(ArgumentOutOfRangeException))]
			public void TestThatCarThrowsOnBadLength()
			{
				new Car(-5);
			}

}
