package ExpediaTest;

import org.junit.Assert;
import org.junit.Test;

import Expedia.Discount;
public class DiscountTest {
	@Test
	public void TestThatDiscountInitializes()
	{
		Discount target = new Discount(0.01, 1);
		Assert.assertNotNull(target);
		Assert.assertEquals(0.01, target.ReductionPercent, 0.0001);
		Assert.assertEquals(1, target.FrequentFlyerMilesCost);
	}
}
