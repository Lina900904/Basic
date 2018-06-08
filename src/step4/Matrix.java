package step4;

import javax.swing.JOptionPane;

enum Butt {
	EXIT, LEFT_TRIANGLE, RIGHT_TRIANGLE, ZIGZAG, DIAMOND, SAND_GLASS, TRIANGLE, DIAGONAL, SNAIL, MAGIC_SQUARE, MATRIX_CONVERSION;
	}
	public class Matrix {

		public static void main(String[] args) {
			Butt[] buttons = { Butt.EXIT, Butt.LEFT_TRIANGLE, Butt.RIGHT_TRIANGLE, Butt.ZIGZAG, Butt.DIAMOND,
					Butt.SAND_GLASS, Butt.TRIANGLE, Butt.DIAGONAL, Butt.SNAIL, Butt.MAGIC_SQUARE,
					Butt.MATRIX_CONVERSION };
			while (true) {
				Butt select = (Butt) JOptionPane.showInputDialog(null, // frame)
						"MATRIX PAGE", // frame title
						"SLSECT MATRIX MENU", // order
						JOptionPane.QUESTION_MESSAGE, // type
						null, // icon
						buttons, // array of choices
						buttons[1]// default
				);
				switch (select) {
				case EXIT:
					return;
				case LEFT_TRIANGLE:
					JOptionPane.showMessageDialog(null, left_triangle());
					break;
				case RIGHT_TRIANGLE:
					JOptionPane.showMessageDialog(null, Right_triangle());
					break;
				case ZIGZAG:
					JOptionPane.showMessageDialog(null, Zigzag());
					break;
				case DIAMOND:
					JOptionPane.showMessageDialog(null, diamond());
					break;
				default:
					break;
				}
			}

		
	}

		private static String diamond() {
			
			return "";
		}

		private static String left_triangle() {

			return "";
		}

		private static String Zigzag() {

			return "";
		}

		private static String Right_triangle() {

			return "";
		}
	}
	
	
	
