package step1;
import java.util.Scanner;
public class Series {
/**
 * 첫번째 값과 두번째 값을 입력하여 두 사이의 값들을 더하여 결과를 표시하시오
 * */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while(true){
			System.out.println("0.Stop 1.Start");
			int flag = scan.nextInt();
						switch(flag){
				case 0 :System.out.println("종료합니다");return;
				case 1 : 
					System.out.println("첫번째 값을 입력하세요");
					int num1 = scan.nextInt();
					System.out.println("두번째 값을 입력하세요");
					int num2 = scan.nextInt();
					int start=0, end =0;

					if(num1<num2){
						start = num1;
						end = num2;
					}else{
						start = num2;
						end = num1;
					}
		
					 int sum =0;
					for(;start<=end; start++){
						sum += start;
						}
						System.out.println(sum); 


			

				break;
				default :System.out.println("ERROR");return;

			}
		}

	

	}

}
