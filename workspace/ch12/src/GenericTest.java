import java.util.ArrayList;

class Tv{}
class Audio {}

public class GenericTest {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList(); //TvŸ���� ��ü�� ���� ����!!
		ArrayList<Tv> list = new ArrayList<Tv>(); //TvŸ���� ��ü�� ���� ����!!
		list.add(new Tv());
//		list.add(new Audio());
		
//		Tv t = (Tv)list.get(0);	//list�� ù��° ��Ҹ� ������.
		Tv t = list.get(0);	//list�� ù��° ��Ҹ� ������.

	}

}
