package ExpediaTest;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Expedia.Flight;
public class FlightTest {
	private Flight targetFlight;
	private final Date StartDate = new Date(2009, 11, 1);
	private final Date EndDate = new Date(2009, 11, 30);
	
	@Before
	public void TestInitialize()
	{
		targetFlight = new Flight(StartDate, EndDate, 0);
	}
	
	@Test
	public void TestThatFlightInitializes()
	{
		Assert.assertNotNull(targetFlight);
	}
	
	@Test
	public void TestThatFlightHasCorrectMilesAfterConstruction()
	{
		Flight target = new Flight(StartDate, EndDate, 500);
		Assert.assertEquals(500, target.Miles);
	}
	
	@Test
	public void TestThatFlightHasCorrectBasePriceForSameDayFlight()
	{
		Flight target = new Flight(new Date(), new Date(), 0);
		Assert.assertEquals(200, target.getBasePrice(), 0.001);
	}
}
