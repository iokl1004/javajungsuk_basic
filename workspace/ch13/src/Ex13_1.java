class Ex13_1 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1();

		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);	//������ Thread(Runnable target)

		t1.start();	// 0�� ���
		t2.start();	// 1�� ���
	}

}

class ThreadEx1_1 extends Thread {	//1. ThreadŬ������ ����ؼ� �����带 ����
	public void run() {	//�����尡 ������ �۾��� �ۼ�
		for(int i=0; i < 5; i++) {
			System.out.println(this.getName());//������ Thread�� getName()�� ȣ��
		}
	}
}

class ThreadEx1_2 implements Runnable { // 2. Runnalbe �������̽��� �����ؼ� �����带 ����
	public void run() { //�����尡 ������ �۾��� �ۼ�
		for(int i = 0; i < 5; i++) {
			//Thread.currentThread() - ���� �������� Thread�� ��ȯ�Ѵ�.
			System.out.println(Thread.currentThread().getName());
		}
	}
}