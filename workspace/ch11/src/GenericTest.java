import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		ArrayList list = new ArrayList();	// JDK1.5 이전. 지네릭스가 도입이전
		ArrayList<Object> list = new ArrayList<Object>(); // JDK.15이후 지네릭스 도입 된 후 이렇게 작성해야함
		list.add(10);
		list.add(20);
//		list.add("30"); // String을 추가
		list.add("30"); // 타입 체크가 강화됨. 지네릭스 더분에!
		
//		Integer i = (Integer)list.get(2); // 컴파일 OK 컴파일러의 한계
		String i = (String)list.get(2); // 형변환 생략 가능
		
		System.out.println(list);

	}

}
