package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue; // 자동으로 4byte로 변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;
		System.out.println(doubleValue);
		
		longValue = 1000000000000000L;
		float floatValue = longValue;
		System.out.println(floatValue);
		
	}

}
