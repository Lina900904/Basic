package step2;

import java.util.Scanner;

public class test {

	/*
	 * * 이름을 입력하고 국어,영어,수학 점수를 입력하여 과목의 평균값을 계산하시오 90점 이상 A, 80점 이상 B, 70점이상 C, 60점
	 * 이상D, 50점 이상E, 50점 미만F 화면 출력은 "이름 [평균] 85 [학점] B"와 같이 표시하시오
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String neme = scan.next();
		String[] subjects = "국어, 영어, 수학".split(",");

		for (int i = 0; i < subjects.length; i++) { // i값은 국영수가 각각 저장되어 있는값, lenght = 3(국영수)
			System.out.println(subjects[i] + "점수를 입력하세요");
			int sum = Integer.parseInt(scan.next());
				if(input(sum)) {
					params[i]= String.valueof(sum);
				}else {
					i--;
				}
		}

		System.out.printf("이름 | 합계 | 평균 | 등급\n");

	}

	private static boolean input(int sum) {
		// TODO Auto-generated method stub
		return false;
	}

	public static String[] gettotal(String[] sum) {
		String[] result = new String[10];
		result[0] = (
					Integer.parseInt()
				
				
				);
				
		
		return result;
		
		
	public static String[] getgrad(String[] grad) {
		String[] result = new String[3];
		
				
		return result;
	}
		
		
		
		
	}

}
