public class Ex7_7 {

	public static void main(String[] args) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c;	//����ȯ ���� ���� java.lang.ClassCastException
		fe.water();// ������ ������!
//		Car car = null;
//		FireEngine fe = null; //���� �ν��Ͻ��� ���������� �߿�.
//		
//		FireEngine fe2 = (FireEngine)car;	// ���� -> �ڼ����� ����ȯ
//		Car car2 = (Car)fe2; 				// �ڼ� -> �������� ����ȯ
//		car2.stop();	//NullPointerException �߻�.
		
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe; // car = (Car)fe;���� ����ȯ�� ������
////		car.water(); // ������ ����!!! CarŸ���� ���������δ� water()�� ȣ���� �� ����.
//		fe2 = (FireEngine)car;	// �ڼ�Ÿ�� �� ����Ÿ��. ����ȯ ���� �Ұ�
//		fe2.water();

	}

}

class Car {
	String color;
	int door;
	
	void drive() { //�����ϴ� ���
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {	//���ߴ� ���
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car {	//�ҹ���
	void water() {	// ���� �Ѹ��� ���
		System.out.println("Water!!!!");
	}
}