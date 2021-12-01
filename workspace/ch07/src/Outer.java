class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int ilv = outerIv;	//1. �ܺ� Ŭ������ private����� ���ٰ����ϴ�.
		int ilv2 = outerCv;
	}
	
	static class StaticInner {
//	����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ������ ������ �� ����.
//		int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMethod() {
		int lv = 0;			// ���� �ٲ��� �ʴ� ������ ����� ����
		final int LV = 0;	//JDK1.8���� final ��������
		
		class LocalInner { //2. ���� ���� Ŭ������ ���ΰ� �ִ� �޼����� ����� ��밡��!!
			int liv = outerIv;
			int liv2 = outerCv;
			// �ܺ� Ŭ������ ���������� final�� ���� ����(���)�� ���ٰ����ϴ�
			int liv3 = lv;	//����!!! (JDK1.8���� �����ƴ�)
			int liv4 = LV;	//OK
			
			void method() {
				System.out.println(lv);
			}
		}
	}

}