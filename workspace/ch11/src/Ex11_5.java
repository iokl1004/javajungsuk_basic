import java.util.*;

public class Ex11_5 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		Collection c = new HashSet();
		HashSet list = new HashSet();	// Set�� Collection�� �ڼ�
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		// iterator�� 1ȸ���̶� �پ����� �ٽ� ���;� �Ѵ�.
//		it = list.iterator();
		
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
//		for(int i=0;i<list.size();i++) {
//			Object obj = list.get(i);
//			System.out.println(obj);
//		}
	}

}
