import java.util.*;

class Ex11_1 {
	public static void main(String[] args) {
		// �⺻ ����(�뷮, capacity)�� 10�� ArrayList�� ����
		ArrayList list1 = new ArrayList(10);
		// ArrayList���� ��ü�� ���尡��
		// autoboxing�� ���� �⺻���� ���������� �ڵ� ��ȯ
//		list1.add(new Integer(5));
		list1.add(5);
		list1.add(new Integer(4));
		list1.add(new Integer(2));
		list1.add(new Integer(0));
		list1.add(new Integer(1));
		list1.add(new Integer(3));
		// ArrayList(Coleection c)
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1, list2);
		
		Collections.sort(list1);	//list1�� list2�� �����Ѵ�.
		Collections.sort(list2);	//list1�� list2�� �����Ѵ�.
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");	//index 3�� A�� �߰��Ѵ�.
		print(list1, list2);
		
		list2.set(3, "AA");	//index 3�� ��ġ�Ѱ��� AA�� �����Ѵ�.
		print(list1, list2);
		
		list1.add(0,"1");	//index 0�� ���ڿ� 1�� �߰��Ѵ�.
		//indexOf()�� ������ ��ü�� ��ġ(�ε���)�� �˷��ش�.
		System.out.println("index=" + list1.indexOf( new Integer(1)));	//list1���� int���� 1�� ���°�� �մ��� �˷��ش�.
		System.out.println("index=" + list1.indexOf("1"));	//list1���� �������� 1�� ���°�� �մ��� �˷��ش�.
		
		list1.remove(5);	//index 5�� �ִ� ��ü�� ����
		print(list1, list2);
		
		list1.remove(new Integer(1)); //list1���� int�� 1�� ����
		print(list1, list2);
		
		// list1���� list2�� ��ġ��
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));
		print(list1, list2);
		
		// list2���� list1�� ���Ե� ��ü���� �����Ѵ�.
		for (int i = list2.size()-1; i >= 0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
		
	}	//main�� ��
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
	}

}	//class
