package sec04.exam01_arithmetic;

public class AccuracyExample2 {

	public static void main(String[] args) {
		// 정수 7에 0.1을 곱할시 맨 마지막에 1이 붙어 정확한 계산을 할 수 없다.
		double result_e = 7 * 0.1;
		System.out.println(result_e);
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 한개에서");
		System.out.println("0.7 조각을 빼면");
		System.out.println(result + "조각이  남는다."); // 오차 발생(정수 연산이 아닌 실수 연산시 발생)

	}

}
