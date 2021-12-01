class Ex7_13 {
	class InstanceInner {}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner();	// 인스턴스멤버끼리는 직접 접근 가능
	static StaticInner cv = new StaticInner();	// static 멤버끼리는 직접 접근 가능
	
	static void staticMethod() {	// static멤버는 인스턴스멤버에 직접 접근 불가
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void instanceMethod()	{
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
//		LocalInner lv = new LocalInner();	//지역 내부 클래스는 외부에서 접근 할 수 없다.
	}
	
	void myMethod() {
		class LocalInner {}
		LocalInner lv = new LocalInner();
	}
}
