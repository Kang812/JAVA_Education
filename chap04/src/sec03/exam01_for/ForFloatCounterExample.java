package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {
		// 실수 반복문 사용시 정수 사용
		// 가비지 값이 포함되어서 반복문의 횟수가 줄어들음
		for(float x = 0.1f; x <= 1.0f; x+= 0.1f) {
			System.out.println(x);
		}

	}

}
