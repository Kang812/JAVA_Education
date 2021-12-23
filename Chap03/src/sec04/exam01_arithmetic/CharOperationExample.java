package sec04.exam01_arithmetic;

public class CharOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;  // 컴파일 에러 발생
		char c3 = (char)(c2 + 1);
		int result  = c2 + 1;
		char c4 = (char)(result);
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("result=" + result);
		System.out.println("c3 = " + c3);
		System.out.println("c4=" + c4);
	}

}
