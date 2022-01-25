
public class ArrayRotation {
   /*
	static void rotateBy_90(int[][] arr)
	{
		System.out.print("==================\n");
		for(int j=0;j<3;j++)	
		{
			for(int i=2;i>=0;i--)
			System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int[][] array = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		rotateBy_90(array);

	}
    */
	
	public static void main(String[] args) {
		int[][][] array=new int[3][3][3];
		int[] pixel1 = {12, 45, 78};
	 	int[] pixel2 = {34, 12, 90};
	 	int[] pixel3 = {0, 234, 56};
	 	
	 	int[] pixel4 = {12, 45, 78};
	 	int[] pixel5 = {12, 45, 78};
	 	int[] pixel6 = {12, 45, 78};
	 	
	 	int[] pixel7 = {12, 45, 78};
	 	int[] pixel8 = {12, 45, 78};
	 	int[] pixel9 = {12, 45, 78};
	 	
	 	// Representation of an Image
	 	int[][][] image = {
	 						{pixel1, pixel2, pixel3},
	 						{pixel4, pixel5, pixel6},
	 						{pixel7, pixel8, pixel9},
	 					};
	 	
	 	
	 	for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				  System.out.print("{"+image[i][j][k]+"}");
				System.out.print("    ");
			}
			System.out.println();
		}
		/*
	 	System.out.print("90 to right==================\n");
		for(int j=0;j<3;j++)	
		{
			for(int i=2;i>=0;i--)
			{
				
				for(int k=0;k<3;k++)
				{
					System.out.print("{"+image[i][j][k]+"}");
				    array[j][i][k]=image[i][j][k]; 
				}
				System.out.print("   ");
				
			}
			System.out.println();
		}
		
        System.out.println("\n180 to left================");
        
        for(int i=2;i>=0;i--)	
		{
			for(int j=2;j>=0;j--)
			{
			    //
				for(int k=0;k<3;k++)
				{
					System.out.print("{"+image[i][j][k]+"}");
				}
				System.out.print("   ");
			
			}
			System.out.println();
		}
        */
        System.out.println("\n Gray scaling=============");
        int sum=0;
        for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					sum = sum + image[i][j][k];
				}
				//System.out.print("  "+sum/3);
				for(int l=0;l<3;l++)
				{
					image[i][j][l]=sum/3;
					System.out.print("{"+image[i][j][l]+"}");
				}
				sum=0;
				System.out.print("    ");
			}
			System.out.println();
		}
	 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
