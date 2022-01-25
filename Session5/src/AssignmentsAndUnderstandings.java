import java.lang.String;
import java.util.Scanner;

//1.Explore all various string builtin methods

    //ALL various String Methods.Link
   //https://www.programiz.com/java-programming/string
   //https://www.javatpoint.com/methods-of-string-class
   //For all method to know--https://www.w3schools.com/java/java_ref_string.asp.



//Important theory from sessions.


//in one go.
		// if we wish to print data in array :)
				//System.out.println("++ Data Before is: "+Arrays.toString(data));
	//when array is passed as argument to a method then reference of the array is created.
	// changes done on array in method effect the array in main method.
		
	/*
	  OVERLLOADING
	  // Compile Time Polymorphism
	// >> Overloading
	// RULES to Overload:
	// 1. Name must be Same
	// 2. Inputs must be UNIQUE
	// 		2.1 number of inputs
	//      2.2 type of inputs
	//      2.3 sequence of inputs
	// 3. Return type has no role to play
	 */
	/*STRING Built Method.
	   string is not mutable so assignment is not possible once it is holding any value 
	   string.indexOf();
	   string.CharAt(index);
	   string.length();
	   idx = names.indexOf("Jim"); // index of Jim's J
	   String subString = names.substring(idx); // from idx till end
	   String name = names.substring(idx, 17);
	   
	   String[] strArr = names.split(",");
		for(String str : strArr) {
			System.out.println(str.trim());
		}
		String email = "john@example.com";
		if(email.contains("@") && email.contains(".")) {
			System.out.println("A Valid Email");
		}else {
			System.out.println("Not a Valid Email");
		}
		
		String googleEmail = "john@gmail.com";
		if(googleEmail.endsWith("gmail.com")) { // also we got startsWith method
			System.out.println("Its a Valid Google Email");
		}else {
			System.out.println("Not a Valid Email");
		}
	 */


//2.Assignment
public class AssignmentsAndUnderstandings {

	static void printMp3Files(String[] str1) 
	{
		System.out.println("\n=====Music Files=====");
		for(String element : str1){
			if(element.endsWith(".mp3")) {
				System.out.printf("\nThis music file name is : %s",element);
			}
			
		}
	}
    static void printTxtFiles(String[] str1)
    {
    	System.out.println("\n=====Txt Files=====");
		for(String element : str1){
			if(element.endsWith(".txt")) {
				System.out.printf("\nThis text file name is : %s",element);
			}
		}
			
		
	}
    static void printPngFiles(String[] str1)
    {
    	System.out.println("\n=====Png Image Files=====");
		for(String element : str1){
			if(element.endsWith(".png")) {
				System.out.printf("\nThis Image file name is : %s",element);
			}
		}
	}
	
	public static void main(String[] args) {
		String[] file = {"song1.mp3","hello.txt","image.png","song2.mp3","new.txt","image2.txt"};
		printMp3Files(file);
		printPngFiles(file);
		printTxtFiles(file);
	
	}

}
