package sprinters;

public class Vehicle
{
	private int rented;
	private int avalibale;
	private int total;
	
	public Vehicle() 
	{
		
	}

	public int getRented()
	{
		return rented;
	}

	public void setRented(int rented)
	{
		this.rented = rented;
	}

	public int getAvalibale()
	{
		return avalibale;
	}

	public void setAvalibale(int avalibale)
	{
		this.avalibale = total - rented;
	}
	
	public int getTotal() 
	{
		return total;
	}
}
