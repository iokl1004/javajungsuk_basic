import java.util.ArrayList;

class Tv{}
class Audio {}

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); //Tv타입의 객체만 저장 가능!!
		ArrayList<Tv> list = new ArrayList<Tv>(); //Tv타입의 객체만 저장 가능!!
		list.add(new Tv());
//		list.add(new Audio());
		
//		Tv t = (Tv)list.get(0);	//list의 첫번째 요소를 꺼낸다.
		Tv t = list.get(0);	//list의 첫번째 요소를 꺼낸다.

	}

}
