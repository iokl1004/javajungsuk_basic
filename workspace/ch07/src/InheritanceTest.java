class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint { //���
//	int r;
//}

class Circle extends Object{	//����
	MyPoint p = new MyPoint();	//���������� �ʱ�ȭ
//	MyPoint p	//�̷��� �ϸ� �ȵ�;;
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString()); // "Circle@626b2d4a" Ŭ������+��ü�� �ּҰ�

		Circle c2 = new Circle();
		System.out.println(c2); // "Circle@5e91993f" Ŭ������+��ü�� �ּҰ�
		
//		c.p.x = 1; //����
//		c.p.y = 2; //����
		
//		c.x = 1; //���
//		c.y = 2; //���
		
//		c.r = 3;
//		System.out.println("c.p.x="+c.p.x);	//����
//		System.out.println("c.p.y="+c.p.y); //����
//		System.out.println("c.x="+c.x); //���
//		System.out.println("c.y="+c.y); //���
//		System.out.println("c.r="+c.r);
	}

}
