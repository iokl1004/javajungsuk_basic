class MyPoint {
	int x;
	int y;
}

//class Circle extends MyPoint { //상속
//	int r;
//}

class Circle extends Object{	//포함
	MyPoint p = new MyPoint();	//참조변수의 초기화
//	MyPoint p	//이렇게 하면 안됨;;
	int r;
}

public class InheritanceTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println(c.toString()); // "Circle@626b2d4a" 클래스명+객체의 주소값

		Circle c2 = new Circle();
		System.out.println(c2); // "Circle@5e91993f" 클래스명+객체의 주소값
		
//		c.p.x = 1; //포함
//		c.p.y = 2; //포함
		
//		c.x = 1; //상속
//		c.y = 2; //상속
		
//		c.r = 3;
//		System.out.println("c.p.x="+c.p.x);	//포함
//		System.out.println("c.p.y="+c.p.y); //포함
//		System.out.println("c.x="+c.x); //상속
//		System.out.println("c.y="+c.y); //상속
//		System.out.println("c.r="+c.r);
	}

}
