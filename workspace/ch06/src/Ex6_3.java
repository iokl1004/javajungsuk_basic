
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
		
		System.out.println("c1�� " + c1.kind + ",�̸�, ũ��� (" + c1.height + "," + c1.width + ")");
		System.out.println("c1�� " + c2.kind + ",�̸�, ũ��� (" + c2.height + "," + c2.width + ")");
		System.out.println("Card���� widht�� height�� ���� 50, 80���� �����մϴ�.");
		Card.width = 50;
		Card.height = 80;
		
		System.out.println("c1�� " + c1.kind + ",�̸�, ũ��� (" + c1.height + "," + c1.width + ")");
		System.out.println("c1�� " + c2.kind + ",�̸�, ũ��� (" + c2.height + "," + c2.width + ")");

	}

}

class Card {
	String kind;	//���� (���� �Ӽ�) (iv)
	int number;	//���� (���� �Ӽ�) (iv)

	static int width = 100; //�� (���� �Ӽ�) (cv)
	static int height = 250; //���� (���� �Ӽ�) (cv)
}