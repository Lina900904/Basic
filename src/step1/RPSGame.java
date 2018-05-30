package step1;
import java.util.Scanner;
public class RPSGame {
	
	/**
	 * 가위바위보를 입력하여 승자를 화면에 출력하시오
	 * */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("A: 바위R,가위S,보P 중 입력해봐");
		String a = scan.next();

		System.out.println("B: 바위R,가위S,보P 중 입력해봐");
		String b = scan.next();


		String result ="";
	
		
		if((a.equals("R") && b.equals("R")) || (a.equals("P") && b.equals("P")) || (a.equals("S") && b.equals("S"))){
			result="비김";
		}else if((a.equals("R") && b.equals("P")) || (a.equals("P") && b.equals("S")) || (a.equals("S") && b.equals("R"))){
			result="A 이김";
		}else {
			result="B이김";
		}


		System.out.println(result);

	}

}
