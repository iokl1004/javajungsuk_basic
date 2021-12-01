class A {
	public void method(I i) {	// �������̽� I�� ������ �ѵ鸸 ���Ͷ�
		i.method();
	}
}

// BŬ������ ����� ������ �и�
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		A a = new A();
		a.method(new C());	// A�� B�� ���(����)

	}

}