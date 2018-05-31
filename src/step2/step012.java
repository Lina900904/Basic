package step2;

import java.util.Scanner;

/**
 * [수열012]1부터 10까지 합을 구하시오 출력은은 1+2+3..+10=55 0종료 1홀수의 합 2짝수의 합
 */
public class step012 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("0.Stop  1.홀수의합, 2.짝수의 합");
			int flag = scan.nextInt();
			switch (flag) {
			case 0:
				System.out.println("Bye");
				return;
			case 1:
				System.out.println("첫번째 값");
				int num1 = scan.nextInt();
				System.out.println("마지막 값");
				int num2 = scan.nextInt();
				int start = 0, end = 0, sum = 0, count = 0, totalcount = 0;
				if (num1 < num2) {
					start = num1;
					end = num2;
				} else {
					start = num2;
					end = num1;
				}

				String result = "";

				for (int i = start; i <= end; i++) {
					if (i % 2 != 0) {
						count++;
					}
				}
				totalcount = count;
				count = 0;
				for (int i = start; i <= end; i++) {

					if (i % 2 == 1) {
						count++;
						if (count == totalcount) {
							result += i + "=";
						} else {
							result += i + "+";
						}
						sum += i;
					}
				}
				System.out.println(result + sum);

				break;

			case 2:
				System.out.println("첫번째 값");
				num1 = scan.nextInt();
				System.out.println("마지막 값");
				num2 = scan.nextInt();
				start = 0;
				end = 0;
				sum = 0;
				if (num1 < num2) {
					start = num1;
					end = num2;
				} else {
					start = num2;
					end = num1;
				}

				result = "";
				for (int i = start; i <= end; i++) {
					if (i % 2 == 0) {
						if (i == end - 1) {
							result += i + "=";
						} else {
							result += i + "+";
						}
						sum += i;
					}
				}
				System.out.println(result + sum);

				break;

			default:
				return;

			}

		}

	}

}
