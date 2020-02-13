package sprinters;

import java.awt.Menu;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.xml.transform.Source;

public class DriverMain
{

	public static void main(String[] args)
	{
		try
		{
			showMenu();
		} catch (InputMismatchException e)
		{
			System.err.println("Not a valid selection");
		}
	}

	public static void showMenu() throws InputMismatchException
	{

		ArrayList<Location> companyList = Company.addLocations();

		boolean Continue = true;

		while (Continue == true)
		{

			System.out.println("Please select an option.");
			System.out.println("1. Add new location \n2. Show list of locations."
					+ "\n3. Show location based on zip. \n4. Show all location data"
					+ "\n5. Show location rate \n6. Show all vehicles avaliable"
					+ "\n7. Calulate daily revenue. \n8. Get data from specific location \n9. Exit");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			if (choice == 1)
			{// add location
				Company.addNewLocation();
			} else if (choice == 2)
			{
				Company.showList();
			} else if (choice == 3)
			{// show based on zip
				Company.locatebyZip();
			} else if (choice == 4)
			{
				Company.showLocationData();
			} else if (choice == 5)
			{// show location rate
				Company.numberFive();
				System.out.println();
			} else if (choice == 6)
			{// show all vehicles available
				Company.showAllVehicles();
			} else if (choice == 7)
			{
				Company.calculateRev();
			} else if (choice == 8)
			{
				Company.getDatabyLocation();
			} else if (choice == 9)
			{
				System.out.println("Goodbye");
				Continue = false;
			} else
			{
				System.out.println("Not valid entry");

			}

		}
	}
}