package step1;
import java.util.Scanner;
public class GradReport {

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
