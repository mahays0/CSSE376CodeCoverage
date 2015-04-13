package ExpediaTest;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Expedia.Booking;
import Expedia.Car;
import Expedia.Flight;
import Expedia.Hotel;

public class BookingTest {
	public static void main (String args[]) {
        org.junit.runner.JUnitCore.main("ExpediaTest.BookingTest");
    }
	
	private Car targetCar;
	private Flight targetFlight;
	private Hotel targetHotel;
	private final int DaysToRentCar = 5;
	private final Date StartDate = new Date(2009, 11, 1);
	private final Date EndDate = new Date(2009, 11, 30);
	private final int NightsToRentHotel = 5;
	
	@Before
	public void TestInitialize()
	{
		targetCar = new Car(DaysToRentCar);
		targetFlight = new Flight(StartDate, EndDate, 0);
		targetHotel = new Hotel(NightsToRentHotel);
	}
	
	@Test
	public void TestThatObjectsAreBookings()
	{
		List<Booking> list = new LinkedList<Booking>();
		
		list.add(targetCar);
		list.add(targetFlight);
		list.add(targetHotel);
		
		Assert.assertNotNull(list);
	}

}
