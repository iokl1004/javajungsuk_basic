import java.util.ArrayList;	//crtl+shift+o �ڵ� import�� �߰�

public class RoundTest3 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));	//list���� ��ü�� �߰� ����
		list.add(100);	//JDK1.5�������� ����.
		
//		Integer i = list.get(0);	// list�� ����� ù��° ��ü�� ������.
//		int i = list.get(0).intValue();//intValue()�� Integer�� int�� ��ȯ
		int i = list.get(0);//intValue()�� Integer�� int�� ��ȯ
		// �����Ϸ��� �ڵ����� �־���
	}

}
