
import java.util.Scanner;
public class Array {

	/*
	 * //1.Bubble Sort.
	static void bubbleSort(int[] array) {
		int temp=0;
		System.out.println("\nAtfer Bubble Sort\n");
		for(int i=0;i<array.length;i++)
		{   //System.out.println(i);
			for(int j=0;j<(array.length-i-1);j++)
			{   //System.out.println("\t"+j);                 Commented lines are for checking.
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					//System.out.println("\t\t"+temp+"\t"+array[j]);
					
				}
			}
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	  }
	  */  
	
	
	
	
	
	
		// TODO Auto-generated method stub
        //int[] arr = new int[5]; or int arr[]=...
		//int[] arr = {....};
		//int[] arr = new int[]{....};
		//for two int[] arr1,arr2;
		//arr1=new int[5]{....};
		/*
		 Enhanced for loop
		 for(int element: arr){ 
		 System.out.print(elements+" ");
		 }
		 
		 
		
		reference copy operation(int[] a2=a1).assigning one arry to other arry
		if we change any one the will aslo be cchange. 
		

		/*
		int[] a1 = {10, 20, 30, 40, 50};
		int[] a2 = a1;	
		
		System.out.println("a1 is: "+a1);
		System.out.println("a2 is: "+a2);
		
		int a = 20; // on primitive
		int b=a;
		a1[2] = 77; // on reference
        
		b=30;
		System.out.println("b now is: "+a);
		System.out.println("a1[2]: "+a1[2]);
		System.out.println("a2[2]: "+a2[2]);
		
		//static methods return type with static void ... to execute this we need
		// reference to object of class.
		
		//non-static methods return type with void ....just execute with class name. 
        */
	//insertion sort	
	void sort(int[] array)
    {
		System.out.println("\nAtfer Insertion Sort\n");
        for(int i = 1; i < array.length; ++i) 
        {
            int key = array[i];
            int j = i - 1; 
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
        
    }
 
		
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr_size = input.nextInt();
		int[] arr1=new int[arr_size];
		System.out.println("Enter elements:");
		for(int i=0;i<arr_size;i++)
		{
			arr1[i]=input.nextInt();
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		Array obj = new Array();
		obj.sort(arr1);
		//Array.bubbleSort(arr1);
		input.close();
		
		
		
		
		
		
  	}

}
