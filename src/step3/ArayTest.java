package step3;

import javax.swing.JOptionPane;
//총점, 평균,등급

public class ArayTest {

	public static int gettotal(String[] scorses) {
		return Integer.parseInt(scorses[1]) + Integer.parseInt(scorses[2]) + Integer.parseInt(scorses[3]);
	}

	public static int getavg(String[] scorses) {
		return (Integer.parseInt(scorses[1]) + Integer.parseInt(scorses[2]) + Integer.parseInt(scorses[3])) / 3;
	}

	public static void main(String[] args) {
		String[] students = new String[5];
		String[] ranking = new String[3];
	
		int count=0;
		while (true) {
		
			String menu = JOptionPane.showInputDialog("0.종료 1.성적입력 2.전체보기 3.순위출력");
			switch (menu) {
			case "0":
				return;
			case "1":
			
				String score = JOptionPane.showInputDialog("이름/국어/영어/수학");
				String[] arr = score.split("/");
				int total =gettotal(arr);
				int avg=getavg(arr);
				
					String student = arr[0] + "|" + arr[1] + "|" + arr[2] + "|" + arr[3] + "|" +total + "|"
							+ avg;
					students[count] = student;
					count++;

				break;
				case "2":
					String result = "순위|이름|국어|영어|수학|총점|평균\n";
					for(int i=0;i<students.length;i++) {
						result+=students[i]+"\n";
					}
					JOptionPane.showMessageDialog(null,	 result);
					break;
					
				case "3":
					String[] temp = new String[4];
			/*	
					temp[0] = students[0].split("\\|");
					int a = Integer.parseInt(temp[4]);
					temp[1] = students[1].split("\\|");
					int b = Integer.parseInt(temp[4]);
					temp[2] = students[2].split("\\|");
					int c = Integer.parseInt(temp[4]);
					if(a>b&&a>c) {
						if(b>c) {
							ranking[0]=students[0];//a>b>c
						}else {
							ranking[1]=students[2];//a>c>b
						}*/
				/*	}else if(b>c) {*/
					JOptionPane.showMessageDialog(null,ranking[0]+ranking[1]+ranking[2]);
				break;
			
			}
			}

		}

}
