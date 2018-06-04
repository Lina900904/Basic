package step3;
import javax.swing.JOptionPane;
public class Starbucks2 {

	public static void main(String[] args) {
		JOptionPane scan = new JOptionPane();
		int totalprice = 0;
		int price = 0;
		int count = 0;
		while (true) {
			String option = JOptionPane.showInputDialog("0주문완료\n" + "1아메리카노3000\n" + "2라떼3500\n" + "3카푸치노4000\n");
		
			String[] menu = { "아메리카노", "라떼", "카푸치노" };
			int pri[] = { 3000, 3500, 4000 };
			switch (option) {
			case "1":
				String cnt = JOptionPane.showInputDialog("몇잔 드릴까요\n");
				count = Integer.parseInt(cnt);
				price = count * pri[0];
				totalprice += price;
				break;
			case "2":
				cnt = JOptionPane.showInputDialog("몇잔 드릴까요\n");
				count = Integer.parseInt(cnt);
				price = count * pri[1];
				totalprice += price;
				break;
			case "3":
				cnt = JOptionPane.showInputDialog("몇잔 드릴까요\n");
				count = Integer.parseInt(cnt);
				price = count * pri[2];
				totalprice += price;
				break;
			case "0":
				JOptionPane.showMessageDialog(null, "결제금액은 총" + totalprice + "입니다");
				JOptionPane.showMessageDialog(null, "이용해주셔서 감사합니다");
				return;
			}
			JOptionPane.showMessageDialog(null, price + "입니다");
	
		}

	}

}
