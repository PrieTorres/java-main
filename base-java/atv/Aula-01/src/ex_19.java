
public class ex_19 {

	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 8;
		int num3 = 9;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		
		System.out.println("media 8,9,7: "+((num1+num2+num3)/3));
		System.out.println("media 4,5,6: "+((num6+num4+num5)/3));
		
		System.out.println("soma das médias: "+( ((num1+num2+num3)/3) + ((num6+num4+num5)/3) ));
		System.out.println("media das médias: "+( (((num1+num2+num3)/3) + ((num6+num4+num5)/3) )/2)  );
	}

}
