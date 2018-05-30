package step1;
import java.util.Scanner;
public class CheckGender {
	public static void main(String[] args) {
 		Scanner scan = new Scanner(System.in);

		 	while(true){
		System.out.println("0.STOP  1.START");
		int flag = scan.nextInt();
		switch(flag){
			case 0 : System.out.println("종료합니다");return;
			default :  			
		
		System.out.println("이름 입력");
			String neme = scan.next();

		System.out.println("주민번호 입력");
			String ssn = scan.next();
			char ch = ssn.charAt(7);

			String gender = "";
		
		switch(ch){
			case '1': 
			case '3': gender = "남";break;
			case '2':
			case '4': gender = "여";break;
			case '5': 
			case '6': gender = "외국인";break;
			default : gender ="";
		}
		if(gender == ""){
			System.out.println("다시 입력하세요");

		}else{
			System.out.println(neme + ssn + gender);
		}
		}
	}


	}

}
