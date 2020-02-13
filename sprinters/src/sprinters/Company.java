package sprinters;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company
{

	static ArrayList<Location> locations = addLocations();

	public static ArrayList<Location> addLocations()
	{

		Location RentalDealer1 = new Location("Federal Way", 1, 98023, 19.99, 30, 70);
		Location RentalDealer2 = new Location("Tacoma", 2, 98409, 24.99, 40, 60);
		Location RentalDealer3 = new Location("Bellevue", 3, 98004, 29.99, 50, 50);
		Location RentalDealer4 = new Location("Everett", 4, 98201, 20.00, 20, 80);
		Location RentalDealer5 = new Location("Lake City", 5, 98125, 17.99, 10, 90);
		Location RentalDealer6 = new Location("Seattle", 6, 98101, 22.99, 5, 95);

		ArrayList<Location> locations = new ArrayList<>();

		locations.add(RentalDealer1);
		locations.add(RentalDealer2);
		locations.add(RentalDealer3);
		locations.add(RentalDealer4);
		locations.add(RentalDealer5);
		locations.add(RentalDealer6);
		return locations;
	}

	public static void addNewLocation()
	{
	//	ArrayList<Location> companyList = Company.addLocations();
		
		Scanner addScan = new Scanner(System.in);
		//ArrayList<String> LocationName = new ArrayList<>();
		System.out.println("Enter location name: ");
		String locationName = addScan.nextLine();
		//LocationName.add(locationName);
		System.out.println("Enter Location zip: ");
		int locationZip = addScan.nextInt();
		
		System.out.println("Enter Identifier: ");
		int id = addScan.nextInt();
		
		System.out.println("Enter Location Rate: ");
		double locationRate = addScan.nextDouble();
		
		System.out.println("How many of those vehicles are rented?");
		int rentedVehicles = addScan.nextInt();
		
		System.out.println("How many vehicles are at avalibale?");
		int avaliableVehicles = addScan.nextInt();

		Location loc = new Location(locationName, locationZip, locationZip, locationRate, rentedVehicles,
				avaliableVehicles);
		locations.add(loc);

	}
	
	public static void showList()
	{

		System.out.println("List of locations");
		System.out.println("****************");
		for (Location location : locations)
		{
			System.out.println("Location: " + location.getLocationName());
			System.out.println("Price: $" + location.getLocationRate());
			System.out.println("------------------------");
		}
	}
	
	public static void locatebyZip() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter zip: ");
		int zipInput = scan.nextInt();
		// check if zip matches
		for (Location location : locations)
		{
			int locationZips = location.getLocationZipcode();
			if (zipInput == locationZips)
			{
				System.out.println(location.toString());
			}
		}
	}
	
	public static void showLocationData() 
	{
		Company co = new Company();
		for (Location location : locations)
		{
			System.out.println(location.toString());
		}
	}
	
	public static void numberFive() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Type the name of the city you want to rent a vehicle: ");
		String c = scan.next();
		for (Location location : locations)
		{
			String userEntry = location.getLocationName();
			if (c.equalsIgnoreCase(userEntry))
			{
				System.out.println("Your daily rate is " + "$" + location.getLocationRate() + ".");
			}
		}
		System.out.println();
	}
	
	public static void showAllVehicles() 
	{		

		{// show all vehicles available
			System.out.println("Here is all available vehicles from the company:");
			int totalAvailable = getNumAvailableVehicles(Company.addLocations());
			System.out.println(totalAvailable);
		}
	} 
	
	public static int getNumAvailableVehicles(ArrayList<Location> list)
	{
		int totalNumber = 0;
		for (Location location : locations)
		{
			totalNumber += location.getAvailableVehicles();
		}
		return totalNumber;
	}
	
	public static void calculateRev() 
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Type the name of the city to view its daily revenue");
		String c = scan.next();
		for (Location location : locations)
		{
			String userEntry = location.getLocationName();
			if (c.equalsIgnoreCase(userEntry))
			{
				DecimalFormat df = new DecimalFormat("#.##");
				System.out
						.println("Your daily revenue is " + "$" + df.format(location.calcDailyRevenue()) + ".");
			}
		}
	}
	
	public static void getDatabyLocation() 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter city name: ");
		String cityString = scan.next();
		for (Location location : locations)
		{
			if (cityString.equalsIgnoreCase(location.getLocationName()))
			{
				System.out.println(location.toString());
			}
		}
	}


}
