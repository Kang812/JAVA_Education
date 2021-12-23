package verify;
import java.util.Scanner;

public class Excercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------------------------------" );
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료" );
			System.out.println("-------------------------------------------------------------" );
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				
				System.out.print("학생수 > ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
				
			}else if(selectNo == 2){
				for(int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]" + " > ");
					scores[i] = scanner.nextInt();
				}
			}else if(selectNo == 3){
				int i = 0;
				for (int score : scores) {
					System.out.println("scores[" + i + "]" + " = " + score);
					i++;
				}
			}else if(selectNo == 4){
				int sum = 0;
				int max = 0;
				double avg = 0.0;
				
				for(int i = 0; i  < scores.length; i++) {
					sum += scores[i];
					
					if (max < scores[i]) {
						max = scores[i];
					}
				}
				
				avg = (double)sum/scores.length;
				
				System.out.println("총합 : " + sum);
				System.out.println("평균 : " + avg);
				System.out.println("최댓값 : " + max);
				
			}else if(selectNo == 5){
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
