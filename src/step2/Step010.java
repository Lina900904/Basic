package step2;

import java.util.Scanner;

/**
 * 기사시험문제: [수열010] 1+2+3+...+100 까지의 합계 변형된 요구사항: 정수를 입력받아 두 수 사이의 합을 구하는 프로그램을
 * 구현하시오 출력 : 1+2+3+...+10=55
 */
public class Step010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0. Stop  1.Start");
			int flag = scan.nextInt();
			switch (flag) {
			case 1:
				System.out.println("첫번째 값");
				int num1 = scan.nextInt();
				System.out.println("두번째값");
				int num2 = scan.nextInt();
				
				int start=0, end =0;
				if(num1<num2) {
					start = num1;
					end = num2;
				}else {
					start = num2;
					end = num1;
				}
				int sum= 0;
				String op="",result="";
				for(int i=start;i<=end;i++) {
					sum+=i;
				
					if(i ==end) {
						op="=";
					}else {
						op="+";
					}
					result+=i+op;
				
				}
				System.out.println(result+sum);
				
				
				
				
				break;
				
				
				
				
				

			default:
				System.out.println("종료합니다.");
				break;

			}

		}

	}

}
