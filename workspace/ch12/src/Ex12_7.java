class Parent {
	void parentMethod() {}
}

class Child extends Parent {
	@Override
	@Deprecated
	void parentMethod() {} //���� �޼����� �̸��� �߸� ������
}

@FunctionalInterface // �Լ��� �������̽��� �ϳ��� �߻� �޼��常 ����
interface Testable {
	void test();	//�߻�޼���
//	void check();	//�߻�޼���
}

class Ex12_7 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Child c = new Child();
		c.parentMethod();	//Deprecated
	}
}