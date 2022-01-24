import java.lang.String;
import java.util.Scanner;
public class OlaUber {

	public static void main(String[] args) {
		// Assignment ola/uber type of model execution.
		
		Scanner input = new Scanner(System.in);
		System.out.println("=======================");
		System.out.println(": TAXI BOOKING :");
		System.out.println("=======================");
		System.out.println("Welcome User!! Please Enter Your Name: ");
		String U_Name = input.nextLine();
		System.out.println("Enter your Source location: ");
		String S_loc = input.nextLine();
		System.out.println("Enter your Destination Location: ");
		String D_loc = input.nextLine();
		System.out.println("Enter the distance from Source to Destination(IN KM): ");
		double Distance = input.nextDouble();
		
	

		System.out.println("=================================");
		System.out.println("Dear Coustem "+U_Name+" Please Choose Your Vehicle Type: ");
		System.out.println("Press 1 For BIKE(1 passange)");
		System.out.println("Press 2 For AUTO(3 passange)");
		System.out.println("Press 3 For SEDAN(4 passange)");
		System.out.println("Press 4 For SUV(6 passange)");
		System.out.println("Press 0 to exit");
		System.out.println("Pease enter your Choice: ");
		int Choice = input.nextInt();
		if(Choice!=0) 
		{
		switch(Choice) {
		case 1:
			double Bike_charges= 45.0;
			double price=(Distance*5)+Bike_charges;
			System.out.println("Your Ride is ready!.Your Fair Will be \u20b9"+price+". Please press 1 To Continue the process");
			System.out.println("If you wish to cancel.Please press 0");
			int choice_Ride = input.nextInt();
			if(choice_Ride == 1) {
				System.out.println("yehh! "+U_Name+" Your Driver is on the way.");
				System.out.println("Please Pay \u20b9"+price+" After reaching your destination "+D_loc+".");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			}
			else {
				System.out.println("As Per Your Request. We are cancelling Your Ride");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			    }
		case 2:
			double Auto_charges= 65.0;
			price=(Distance*7)+Auto_charges;
			System.out.println("Your Ride is ready!.Your Fair Will be \u20b9"+price+". Please press 1 To Continue the process");
			System.out.println("If you wish to cancel.Please press 0");
			choice_Ride = input.nextInt();
			if(choice_Ride == 1) {
				System.out.println("yehh! "+U_Name+" Your Driver is on the way.");
				System.out.println("Please Pay \u20b9"+price+" After reaching your destination "+D_loc+".");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			}
			else {
				System.out.println("As Per Your Request. We are cancelling Your Ride");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			}
		case 3:
			double Sedan_charges = 80.0;
		    price = (Distance*9)+Sedan_charges; 
			System.out.println("Your Ride is ready!.Your Fair Will be \u20b9"+price+". Please press 1 To Continue the process");
			System.out.println("If you wish to cancel.Please press 0");
			choice_Ride = input.nextInt();
			if(choice_Ride == 1) {
				System.out.println("yehh! "+U_Name+" Your Driver is on the way.");
				System.out.println("Please Pay \u20b9"+price+" After reaching your destination "+D_loc+".");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			}
			else {
				System.out.println("As Per Your Request. We are cancelling Your Ride");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			}
		case 4:
			double SUV_charges = 150.0;
			price = (Distance*13)+SUV_charges; 
			System.out.println("Your Ride is ready!.Your Fair Will be \u20b9"+price+". Please press 1 To Continue the process");
			System.out.println("If you wish to cancel.Please press 0");
			choice_Ride = input.nextInt();
			if(choice_Ride == 1) {
				System.out.println("yehh! "+U_Name+" Your Driver is on the way.");
				System.out.println("Please Pay \u20b9"+price+" After reaching your destination "+D_loc+".");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			}
			else {
				System.out.println("As Per Your Request. We are cancelling Your Ride");
				System.out.println("=====Thank You For Using TAXI BOOKING=====");
				break;
			}
			
		}
			
			
			
		}
		else {
			System.out.println("Dear Customer "+U_Name+" Hope we will See You Soon Riding in our TAXI .");
			System.out.println("=====Thank You For Using TAXI BOOKING=====");
		}
		
		

	  }

}
