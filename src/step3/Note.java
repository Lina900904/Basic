package step3;

import javax.swing.JOptionPane;

public class Note {

	public static void main(String[] args) {


		
		
		
		while (true) {
			String name = JOptionPane.showInputDialog("이름을 입력하세요(QUIT입력시 종료)");
			int[] note = new int[10];
			int[] result = new int[10];
			int[] total = new int[10];
			switch(name) {
			case "QUIT": 
				return;
			default :
				String price = JOptionPane.showInputDialog("출장비 지급액을 입력하세요");
				
	
				int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5};
				int[] num = { 5, 2, 5, 2, 5, 2, 5, 2, 5 };
				for(int i=0; i<=arr.length;i++) {
					
				
					total[i] = Integer.parseInt(price)%arr[0];
					note[i] = total[i]/arr[i];
					result[i] = Integer.parseInt(price)/arr[i];		//갯수		
					
					
					JOptionPane.showMessageDialog(null, "성명:  " + name + "출장비지급액: "+price+"\n"+ "오만:"+result[0]
							+"\n일만: "+ note[1]);
				 break;
				}
				
			}	
		
		}
			
		
			
		
		
		
	}
}
