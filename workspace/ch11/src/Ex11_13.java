import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
		Set set = new TreeSet();	// ���� �˻�, ����. ���� �ʿ����
//		Set set = new HashSet();	// ���� �˻�, ����. ���� �ʿ����
		
		for (int i = 0; set.size() < 6; i++) {
			int num = (int)(Math.random() *45) + 1;
			set.add(new Integer(num));	//set.add(new Integer(num));
		}
		
		System.out.println(set);
	}

}

//class Test implements Comparable {
//	@Override
//	public int compareTo(Object o) {
//		return -1;
//	}
//}	//�� ������ ����.
//
//class TestComp implements Comparator {
//	@Override
//	public int compare(Object o1, Object o2) {
//		return 0;
//	}
//}