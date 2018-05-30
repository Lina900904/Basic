package step1;

import java.util.Scanner;
public class Calc4 {
	public static void main(String[] args) {
		
		/**
		 * 첫번째값, 두번째값, 연산자를 입력하여 계산값을 도출하여
		 * 화면 출력값은 1+3/=4와 같이 표시하시오
		 * 단 +-/* 외에 다른 연산자를 사용하였을때 "잘못된 연산자"를 표시하시오
		 * 
		 * */
		Scanner scan = new Scanner(System.in);

		System.out.println("첫번째 번호를 입력하세요");
		 int num1 = scan.nextInt();
		System.out.println("Enter OPCODE");

		System.out.println("두번째 번호를 입력하세요");

		  int num2 = scan.nextInt();
		 
		 System.out.println("연산자를 입력하세요");  
		  String op = scan.next();

		
		  int num3 = 0;
		  String result = "";

		  switch(op){
		  	case "+" : num3 = num1 + num2; break;
		  	case "-" : num3 = num1 - num2; break;
		  	case "*" : num3 = num1 * num2; break;
		  	case "%" : num3 = num1 % num2; break;
		  	case "/" : num3 = num1 / num2; break;
		  	default : result="잘못된 연산자"; break;  

		  }
		   if((result=="잘못된 연산자")){
 				System.out.println(result);
		   
		   }else{
		   System.out.println(num1 + op + num2 +"=" +num3);

		   }
		  
		   /*  // 더 간소화 시킴 
		   switch(op){
		  	case "+" : num3 = num1 + num2; break;
		  	case "-" : num3 = num1 - num2; break;
		  	case "*" : num3 = num1 * num2; break;
		  	case "%" : num3 = num1 % num2; break;
		  	case "/" : num3 = num1 / num2; break;
		  	default : result="ERROR"; break;  

		  }
		   if(result.equals("ERROR")){
 				result = num1 + op + num2 +"=" +num3;
		   }
		   System.out.print(result);
		   */
			
	}
}


