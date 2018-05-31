package step2;

/**
 * [수열011]1-2+3-4+5-6...-100=-50합계스캐너 없음
 *
 */
public class step011 {

	public static void main(String[] args) {

		int sum = 0, start = 1, end = 100;
		String result = "", op = "";
		for (int i = start; i <= end; i++) {
			if (i % 2 == 1) {
				sum += i;
			} else {
				sum -= i;
			}

			if (i == 100) {
				op = "=";
			} else if (i % 2 == 1) {
				op = "-";
			} else if (i % 2 == 0) {
				op = "+";
			}
			result += i + op;

		}
		System.out.println(result + sum);

	}

}
