class Ex14_0 {
	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a : b;	//���ٽ�. �͸�ü
//		Myfunction2 f = new Myfunction2() {
//			public int max(int a, int b) {	//�ξ�ٸ��� - ���� �����ڴ� ���� �� �ٲ۴�.
//				return a > b ? a : b;
//			}
//		};
		
		// ���ٽ�(�͸� ��ü)�� �ٷ�� ���� ���������� Ÿ���� �Լ��� �������̽��� �Ѵ�.
		Myfunction2 f = (a, b) -> a > b ? a : b;	//���ٽ�. �͸�ü
		
		
		int value = f.max(3, 5);	//�Լ��� �������̽�
		System.out.println("value = " + value);
	}
}

@FunctionalInterface	//�Լ��� �������̽��� �� �ϳ��� �߻� �޼��常 ������ ��.
interface Myfunction2 {
//	public abstract int max(int a, int b);
	int max(int a, int b);
}