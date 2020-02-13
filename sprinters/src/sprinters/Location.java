package sprinters;

import java.awt.List;
import java.util.ArrayList;

public class Location {
	private String locationName;
	private int locationId;
	private int locationZipcode;
	private double locationRate;
	private int rentedVehicles;
	private int availableVehicles;

	
	
	//OR 
	//List AllVehicles;
	
	
	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public int getLocationZipcode() {
		return locationZipcode;
	}

	public void setLocationZipcode(int locationZipcode) {
		this.locationZipcode = locationZipcode;
	}

	public double getLocationRate() {
		return locationRate;
	}

	public void setLocationRate(double locationRate) {
		this.locationRate = locationRate;
	}

	public int getRentedVehicles() {
		return rentedVehicles;
	}

	public void setRentedVehicles(int rentedVehicles) {
		this.rentedVehicles = rentedVehicles;
	}

	public int getAvailableVehicles() {
		return availableVehicles;
	}

	public void setAvailableVehicles(int availableVehicles) {
		this.availableVehicles = availableVehicles;
	}

	public Location(String locationName, int locationId, int locationZipcode, double locationRate,  int rentedVehicles, int availableVehicles) {
		this.locationName = locationName;
		this.locationId = locationId;
		this.locationZipcode = locationZipcode;
		this.locationRate = locationRate;	
		this.rentedVehicles = rentedVehicles;
		this.availableVehicles = availableVehicles;
		
	}
	
	public double calcDailyRevenue() {
		return rentedVehicles * locationRate;
	}
	
	public String toString() 
	{
		return  "***" + locationName.toUpperCase()+ "***" + "\n" +
				"Location ID:        " + locationId + "\n" + 
				"Location Zipcode:   " + locationZipcode + "\n" + 
				"Location Rate:      " + locationRate + "\n" +
				"Rented Vehicles:    " + rentedVehicles + "\n" + 
				"Available Vehicles: " + availableVehicles + "\n";
		
	}
	
	
	
	
	
}		