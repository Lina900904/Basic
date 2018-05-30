package step1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

 		while(true){
			System.out.println("0.STOP  1.START");
			int flag = scan.nextInt();
			switch(flag){
				case 0 : System.out.println("종료합니다");return;
				default : 

 		System.out.println("연도를 입력하세요");
 			int year = scan.nextInt();

 		 	String result = "";

 		 	if(year/4 ==0){
 		 		result = "윤년";
 		 	}else if((year/4 ==0) && (year/100 == 0)){
 		 		result = "평년";
 		 	}else{
 		 		result = "윤년";
 		 	}



 			System.out.println(result);
 			break;
 		}
 		}

	}

}
