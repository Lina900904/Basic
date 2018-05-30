package step1;
import java.util.Scanner;
public class Calendar {
	
	/**
	 * 월을 입력해서 해당 월의 마지막 날을
       알려주는 로직.
       예를 들면, 3월이면 말일이 3월31일입니다.
       9월이면 말일이 9월30일입니다.라고 알려줌.
       단 2월은 2월28일을 말일로 해서 2월28일입니다.
    라고 함.
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	 	while(true){
	 		System.out.println("0.STOP  1.START");
				int flag = scan.nextInt();
				switch(flag){
					case 0 : System.out.println("종료합니다");return;
					default : 

	 	System.out.println("월을 입력하세요");
	 		int m = scan.nextInt();

	 	int ans = 0;


	 	switch(m){
	 		case 1 : ans = 31;break;
	 		case 2 : ans = 28;break;
	 		case 3 : ans = 31;break;
	 		case 4 : ans = 30;break;
	 		case 5 : ans = 31;break;
	 		case 6 : ans = 30;break;
	 		case 7 : ans = 31;break;
	 		case 8 : ans = 31;break;
	 		case 9 : ans = 30;break;
	 		case 10 : ans = 31;break;
	 		case 11 : ans = 30;break;
	 		case 12 : ans = 31;break;
	 	}

	 		System.out.println("말일이"+m+"월"+ans+"일 입니다");
	 		break;
	 	}
	 	}


	}

}
