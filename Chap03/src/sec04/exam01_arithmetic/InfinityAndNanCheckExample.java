package sec04.exam01_arithmetic;

public class InfinityAndNanCheckExample {

	public static void main(String[] args) {
		
		  int x = 5; double y = 0.0; double z = 5/y; double z1 = 5/y;
		 
		  System.out.println("z1="+z1);
		  System.out.println("Double.isInfinite ="+Double.isInfinite(z1));
		  
		  double z2 = 5%y; System.out.println("z2="+z2);
		  System.out.println("Double.isNaN ="+Double.isNaN(z2));
		  
		  double z3 = z2 + 2; System.out.println("NaN + 2="+ z3);
		  
		  z3 = z1 + 2; System.out.println("Infinite + 2="+ z3);
		  
		  if(Double.isInfinite(z) || Double.isNaN(z)) { System.out.println("값 산출 불가");
		  }else { System.out.println(z + 2); }
		 
		
		int int_x = 5;
		int int_y = 0;		
		
		try {
			int int_z = int_x/ int_y;
			System.out.println("z = " + int_z);
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
	}

}
 