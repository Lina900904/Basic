package step3;

import java.util.Scanner;

public class Starbucks1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalprice = 0;
		while (true) {
			System.out.printf("0종료  " + "1아메리카노3000 " + "2라떼3500 " + "3카푸치노4000\n");
			System.out.printf("무엇으로 드릴까요\n");
			int what = scan.nextInt();
			String res = "";
			int price = 0;
			int count = 0;
			String[] menu = {"아메리카노","라떼","카푸치노"};
			int pri[] = {3000,3500,4000};
			
			switch (what) {
			case 1:
				System.out.printf("몇잔 드릴까요\n");
				count = scan.nextInt();
				res = menu[0] + count + "잔";
				price = count * pri[0];
				totalprice += price;
				break;

			case 2:
				System.out.printf("몇잔 드릴까요\n");
				count = scan.nextInt();
				res =  menu[1]+ count + "잔";
				price = count * pri[1];
				totalprice += price;
				break;

			case 3:
				System.out.printf("몇잔 드릴까요\n");
				count = scan.nextInt();
				res =  menu[2]+ count + "잔";
				price = count * pri[2];
				totalprice += price;
				break;

			case 0:
				System.out.println("결제금액은 총" + totalprice + "입니다");
				return;

			}
			System.out.println(price + "입니다");
		}

	}

}
