
public class BreakAndContinue {

	public static void main(String[] args) {
		//Break terminate the loop immediately without checking the 
		//test expression. used inside loops.
		//break;(force immediate termination of loop.)
		
		
		//Using break as Goto
		//Java does not have fun' Goto even though it has as keyword.
		//it uses Labels. Label is used to identify a block of code.
		/*
		 Syntax:
		 label:
		 {
		  _________;
		  ________;
		  statements;
		 
		 } 
		 1.we can jump any label which is not defined for an enclosing block.
		 break label;
		 
		 used break in switch case.
		 
		 */
	outer:
		for(int i=0;i<5;i++)
		{
			inner:
				for(int j=0;j<5;j++)
				{
					
					if(i==j)
					{
						System.out.println(i+"   "+j);
						break inner;  //(if j==i) prints same elements
					    //continue outer;
						
					}
				}
			
		}
	
	
	}

}
