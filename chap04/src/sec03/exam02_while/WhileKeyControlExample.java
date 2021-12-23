package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		// 키보드의 키코드 값을 입력을 받는다라는 의미
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;
		
		while(run) {
			if(KeyCode!=13  && KeyCode!=10) {
				System.out.println("----------------------------------");
				System.out.println("1.증속 | 2.감속 | 3.중지");
				System.out.println("----------------------------------");
				System.out.print("선택:");
			}
			
			KeyCode = System.in.read();
			
			if(KeyCode == 49) {
				speed++;
				System.out.println("현재 속도 = " + speed);
			}else if(KeyCode == 50) {
				speed--;
				System.out.println("현재 속도 = " + speed);
			}else if(KeyCode == 51) {
				run = false;
				System.out.println("프로그램을 중지합니다.");
			}
			}
	    }
	}

