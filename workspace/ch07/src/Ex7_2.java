
public class Ex7_2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.method();

	}

}


class Parent { int x = 10;	/* super.x */ }

class Child extends Parent {
	int x = 20;
	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x); // ÇöÀç ¸â¹öº¯¼ö °ª °¡Á®¿È 20
		System.out.println("super.x = " + super.x); //Á¶»ó ¸â¹öº¯¼ö °ª °¡Á®¿È 10
	}
}