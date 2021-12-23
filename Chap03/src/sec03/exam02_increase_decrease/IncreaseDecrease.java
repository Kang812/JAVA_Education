package sec03.exam02_increase_decrease;

public class IncreaseDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 10;
		int z1;
		int z2;
		
		System.out.println("----------------------------------------");
		x++;
		++x;
		
		System.out.println("x="+x);
		System.out.println("----------------------------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("----------------------------------------");
		
		z1 = x++;
		z2 = ++y;
		System.out.println("z1="+z1);
		System.out.println("x="+x);
		System.out.println("z2="+z2);
		System.out.println("y="+y);
		
		System.out.println("----------------------------------------");
		z1 = ++x + y++;
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		System.out.println("z1="+z1);
	}

}
