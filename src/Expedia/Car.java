package Expedia;

public class Car implements Booking {
	private int numberOfDaysToRent;
	
	public String Name;
	
	public IDatabase Database;
	
    //Get's the current mileage associated with the car
	/*public Int32 Mileage
	{
		get
		{
			return Database.Miles;	
		}
	}*/
	
	public int getMiles(){
		return Database.Miles;
	}

    //Get's the current location of the car
    public String getCarLocation(int carNumber)
    {
        return Database.getCarLocation(carNumber);
    }
	
	public double getBasePrice ()
	{	
		double result = numberOfDaysToRent * 10;
		
		if(numberOfDaysToRent > 5)
		{	
			result *= 0.8;
		}
		
		return result;
	}
	
	public Car (int daysToRent)
	{
		if(daysToRent <= 0)
			throw new RuntimeException("Days to Rent must be greater than zero!");
		
		numberOfDaysToRent = daysToRent;
	}
}
