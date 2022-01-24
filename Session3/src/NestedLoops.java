import java.util.Scanner;
public class NestedLoops {

	public static void main(String[] args) {
     //n- queens ASSIGMENT LOOPS
		char whiteSquare = '\u25A1'; //0
		char blackSquare = '\u25A0'; //1
		char queen = '\u2655';
		/*
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<8;j++)
			{
					if(i%2==0)
					{
					 char square = ((j+1)%2 == 0)? whiteSquare : blackSquare;
					 System.out.print(square+" ");
					 }
					else
				    {
					 char square = ((j%2) == 0) ? whiteSquare : blackSquare;
					 System.out.print(square+" ");
					 
				    }
					
			        
			}
			
			System.out.println();
		 }	
			*/
		//place n-queens
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter no.of Queens(not more than 4): ");
		int nf_Q = obj.nextInt();
		if(nf_Q > 4) 
		{
			System.out.println("Max No.of Queens you can Enter is 4 Only!.");
			System.out.println("Please enter again: ");
			nf_Q = obj.nextInt();
		}
		else 
		{
			nf_Q=nf_Q;
		}
		int [][] Co_Q = new int[nf_Q][2];
		for(int i=0;i<nf_Q;i++)
		{
			System.out.println("Enter the Co-ordinates of "+(i+1)+" Queen.");
			for(int j=0;j<2;j++)
			{
				if(j==0)
				{
					System.out.print("Queen"+(i+1)+" Row: ");
					int row = obj.nextInt();
					if(i==0) {
						Co_Q[i][j]=row;
					 }
					 else 
					 { 
						for(int m=i;m>=0;m--) {
						  if(Co_Q[m][j]==row)
						  {
							System.out.println("This row is already taken.Enter another row.");
							System.out.print("Queen"+(i+1)+" Row: ");
							row = obj.nextInt();
						  }
						  
					    }
						
				     }
				}
				else 
				{
					      System.out.print("Queen"+(i+1)+" Column: ");
					      int column = obj.nextInt();
					      if(i==0) {
							Co_Q[i][j]=column;
						  }
						  else 
						  {
							for(int m=i;m>=0;m--) { 
							  if(Co_Q[m][j]==column) {
								System.out.println("This column is already taken.Enter another column.");
								System.out.print("Queen"+(i+1)+" column: ");
								column = obj.nextInt();
						       }
							  
						   }
					      } 

				 }
			}
	     }

		
					
				
				
			
			
			
		
			
		
	}

}

			
