
public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println("Card.withd = " + Card.width); 
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ",이며, 크기는 (" + c1.height + "," + c1.width + ")");
		System.out.println("c1은 " + c2.kind + ",이며, 크기는 (" + c2.height + "," + c2.width + ")");
		System.out.println("Card들의 widht와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1은 " + c1.kind + ",이며, 크기는 (" + c1.height + "," + c1.width + ")");
		System.out.println("c1은 " + c2.kind + ",이며, 크기는 (" + c2.height + "," + c2.width + ")");

	}

}

class Card {
	String kind;	//무늬 (개별 속성) (iv)
	int number;	//숫자 (개별 속성) (iv)

	static int width = 100; //폭 (공통 속성) (cv)
	static int height = 250; //높이 (공통 속성) (cv)
}