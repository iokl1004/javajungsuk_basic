@FunctionalInterface
interface MyFunction {
	void run();	// public abstract void run();
}

public class Ex14_1 {
	static void execute(MyFunction f) { //�Ű� ������ Ÿ���� MyFunction�� �޼���
		f.run();
	}
	
	static MyFunction getMyFunction() { //��ȯ Ÿ���� MyFunction�� �޼���
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
		return () -> System.out.println("f3.run()");
	}
	
	public static void main(String[] args) {
		// ���ٽ����� MyFunction�� run()�� ����
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		MyFunction f2 = new MyFunction() {	//�͸�Ŭ������ run()�� ����
			public void run() {	//public�� �ݵ�� �ٿ�����
				System.out.println("f2.run()");
			}
		};
		
		MyFunction f3 = () -> System.out.println("f3.run()");
		
		f1.run();
		
		execute(()-> System.out.println("f1.run()"));
		execute( ()-> System.out.println("run()") );

	}

}
