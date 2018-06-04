package step3;

import javax.swing.JOptionPane;

public class Note {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		int price = Integer.parseInt(JOptionPane.showInputDialog("출장비 지급액을 입력하세요"));
		int[] arr = {50000, 10000,5000,1000,500,100,50,10,5};
		
		
		JOptionPane.showMessageDialog(null,"성명:"+name
					+"출장비지급액:"+price+"오만:");


		

		
		
		
	}
}
