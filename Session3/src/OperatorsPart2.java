
public class OperatorsPart2 {

	public static void main(String[] args) {
		//Bitwise operators
		//SE:Where and all we can implement Bitwise Operators
		/*
		 1.Used to perform the manipulation of individual bits of the number.
		 2.only in zeros and ones.Each digit is called a Bit.
		 3.Each group of 8 bits is called one byte.  
		 4.to tell whether a number is EVEN OR ODD.
		 5.swapping a number with xor without using 3rd variable.
		 6.as bitwise is fewer cycles faster than arthematic 
		   this will save response time.
		//negation operators
		
		int x = 10;       //0000 1010 --> 10
		int negation=~x;  //1111 0101 --> -11
		System.out.println("~10 values is:"+negation);
		
		//negation in programming is simply the number +1 and 
		//reverse the sign.
		*/
		//0000 1011   -->binary for 11        
		//1111 0100	
		//       +1
		//1111 0101   -->binary value for -11(are stored as 2's complement)
		
		//0000 1010
		//       
		//0000 1010-->10
		
		int x=14;
		int y=2;
		int z=x >> y;
		System.out.println("z now is:"+z);
		//for positive numbers x divided by y times and floor value is answer
		//for negitive numbers x divided by y times and ceiling value is answer(with -)
		
		//good link for bitwise uses:
		//https://www.linkedin.com/pulse/what-can-we-do-bitwise-operator-real-life-saket-anand/
		//https://blog.tarkalabs.com/real-world-uses-of-bitwise-operators-c41429df507f
		int k=6;       //110
		               //001
		               //000
		System.out.println(k&1);
		
		
	}

}
