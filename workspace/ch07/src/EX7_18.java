import java.awt.*;
import java.awt.event.*;

class EX7_18 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {	//Ŭ������ ���ǿ� ��ü ������ ���ÿ�
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		});
	}
}
