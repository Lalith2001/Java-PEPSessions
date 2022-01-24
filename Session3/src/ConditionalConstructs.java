import java.util.Scanner;
//what is a package? https://www.geeksforgeeks.org/packages-in-java/
/*Package in Java is a mechanism to encapsulate a group of classes, 
  sub packages and interfaces. Packages are used for: 
  Preventing naming conflicts.*/
 
public class ConditionalConstructs {

	public static void main(String[] args) {
		// Conditional constructs meaning conditional Statements
		//reading data using class called Scanner
		Scanner inputs = new Scanner(System.in);// for this to work we need
		//to import java.util.Scanner package.
        System.out.print("Enter an Amount: ");
        double amount = inputs.nextDouble();
        System.out.print("Enter Promo Code: ");
        int promoCode = inputs.nextInt();
        inputs.close();
        // 2 Promo Codes
        int NEWUSER = 101; //flat 50% off for the items worth 250 or above
        int TRYNEW = 201; //Flat 60% off for the items worth 179 or above upto 120.
        System.out.println("Amount is: \u20B9"+amount);
        //System.out.println("Promo Code is: "+promoCode);
        
       //assignment 1:implement in ternary operators if possible in above scenario.
       
       
        /*
        double discount = 0;
        if(promoCode == NEWUSER)
        {
        	if(amount >= 250)
        	{
        		discount = 0.5 * amount;
        		System.out.println("Promo Code NEWUSER Applied Successfully");
        		System.out.println("Discount is: \u20B9"+discount);
        	}
        	else
        	{
        		System.out.println("Amount is Lesser to apply Promo Code.Please add Item worth "+(250-amount)+" more");
        	}
        }
        else if(promoCode == TRYNEW)
        {
        	discount = (amount>=179)?(0.6*amount):(0);
            discount = (discount>120)?(120):(discount);
            if(discount==0) 
            {
               System.out.println("Amount is lesser. Please add items worth "+(179-amount)+" more");
            }
            else
            {
            	System.out.println("Promo Code TRYNEW Applied Successfully");
        		System.out.println("Discount is: \u20B9"+discount);
            }
            
        }
        else
        {
        	System.out.println("Invalid Promo Codes");
        }
        amount -= discount;
        
        System.out.println("===========\nPlease Pay: \u20b9"+amount+" to confirm your order");*/
        
        
        
        
       //2. Whenever a wrong promo code is applied, tell the user whats the right promo code
        
        
        double discount = 0;
        if(amount >= 250 )
        {
        	if(promoCode == NEWUSER)
        	{
        		discount = 0.5 * amount;
        		System.out.println("Promo Code NEWUSER Applied Successfully");
        		System.out.println("Discount is: \u20B9"+discount);
        		amount -= discount;
                System.out.println("===========\nPlease Pay: \u20b9"+amount+" to confirm your order");
        	}
        	else if(promoCode == TRYNEW)
        	{
        		discount = 0.6 * amount;
        		discount = (discount>120)?(120):(discount);
        		System.out.println("Promo Code NEWUSER Applied Successfully");
        		System.out.println("Discount is: \u20B9"+discount);
        		amount -= discount;
                System.out.println("===========\nPlease Pay: \u20b9"+amount+" to confirm your order");
        	}
        	else if(promoCode != TRYNEW )
        	{
        		System.out.println("Dear user you have entered wrong Promo code.Please try Promo Code NEWUSER(101)");
        		
        	}
        	else
        	{
        		System.out.println("Amount is Lesser to apply Promo Code.Please add Item worth "+(250-amount)+" more");
        	}
        }
        else if(amount>=179)
        {
        	discount = (promoCode == TRYNEW)?(0.6*amount):(0);
            discount = (discount>120)?(120):(discount);
            if(promoCode == NEWUSER || promoCode != TRYNEW)
            {
            	System.out.println("Dear user you have entered wrong Promo code.Please try Promo Code TRYNEW(101)");
            }
            else if(discount==0) 
            {
               System.out.println("Amount is lesser. Please add items worth "+(179-amount)+" more");
            }
            else
            {
            	System.out.println("Promo Code TRYNEW Applied Successfully");
        		System.out.println("Discount is: \u20B9"+discount);
        		amount -= discount;
                System.out.println("===========\nPlease Pay: \u20b9"+amount+" to confirm your order");
            }
            
        }
        else
        {
        	System.out.println("Your amount Doesn't include any Promo codes");
        	amount -= discount;
            System.out.println("===========\nPlease Pay: \u20b9"+amount+" to confirm your order");
        }
        System.out.println("THANK YOU :)");
        
	}

}
