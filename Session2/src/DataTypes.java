
public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 35;
		System.out.println("1.age is "+age);
		//byte range is from -128 to 0 to 127 total =2 
		//power 8 = 256
		age=(byte)129;
		System.out.println(age);
		//UpCasting can be implicitly or explicitly.
		//DownCasting can only explicitly.
		//Child to parent upcasting and parent to child DownCasting
		//upcasting is aslo known as Generalization or widening
		int hell=21;
		age=(byte)hell;
		float percent=75.7F;
		
	}

}
