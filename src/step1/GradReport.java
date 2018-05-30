package step1;
import java.util.Scanner;
public class GradReport {
/**
 * 이름을 입력하고 국어,영어,수학 점수를 입력하여 
 * 과목의 평균값을 계산하시오
 * 90점 이상 A, 80점 이상 B, 70점이상 C, 60점 이상D, 50점 이상E, 50점 미만F
 * 화면 출력은 "이름 [평균] 85 [학점] B"와 같이 표시하시오
 * */
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("이름");
			String name = scan.next();
		System.out.println("국어점수");
			int language = scan.nextInt();
		System.out.println("영어점수");
		  	int english = scan.nextInt();
		System.out.println("수학점수");
			int meth = scan.nextInt();

			int a = 3;
			int ever = (language + english + meth) /a;

			

			
			int b= ever/10; 
			String result = "";

			switch(b){
				case 9: result = "90점 이상 A";break;
				case 8: result = "80점 이상 B" ;break;
				case 7: result = "70점 이상 C" ;break;
				case 6: result = "60점 이상 D" ;break;
				case 5: result = "50점 이상 E";break;
				default : result = "";
			}
			if(result == ""){
				System.out.println("F");
			}else{
				System.out.println( name +"[평균]"+ ever + "[학점]" + result);
			}

			

	}

}
