class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner();	// �ν��Ͻ���������� ���� ���� ����
	static StaticInner cv = new StaticInner();	// static ��������� ���� ���� ����
	
	static void staticMethod() {	// static����� �ν��Ͻ������ ���� ���� �Ұ�
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod()	{
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();	//���� ���� Ŭ������ �ܺο��� ���� �� �� ����.
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
