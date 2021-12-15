
public class Ex13_8 {

	public static void main(String[] args) {
		ThreadEx8_1 th1 = new ThreadEx8_1();
		ThreadEx8_2 th2 = new ThreadEx8_2();
		th1.start();
		th2.start();

		delay(2*1000);
		System.out.print("<<main 종료>>");

		System.out.print("<<main 종료>>");
	}	//main

	static void delay(long millis) {
		try {
			Thread.sleep(2000);//th1을 2초동안 잠자게?
		} catch ( InterruptedException e) {}	//주석하면 바로 에러!!
	}
}

class ThreadEx8_1 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("-");
		System.out.print("<<th1 종료>>");
	} // run()
}

class ThreadEx8_2 extends Thread {
	public void run() {
		for(int i=0; i < 300; i++) System.out.print("|");
		System.out.print("<<th2 종료>>");
	} // run()
}