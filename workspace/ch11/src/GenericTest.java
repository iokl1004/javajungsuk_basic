import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList list = new ArrayList();	// JDK1.5 ����. ���׸����� ��������
		ArrayList<Object> list = new ArrayList<Object>(); // JDK.15���� ���׸��� ���� �� �� �̷��� �ۼ��ؾ���
		list.add(10);
		list.add(20);
//		list.add("30"); // String�� �߰�
		list.add("30"); // Ÿ�� üũ�� ��ȭ��. ���׸��� ���п�!
		
//		Integer i = (Integer)list.get(2); // ������ OK �����Ϸ��� �Ѱ�
		String i = (String)list.get(2); // ����ȯ ���� ����
		
		System.out.println(list);

	}

}
