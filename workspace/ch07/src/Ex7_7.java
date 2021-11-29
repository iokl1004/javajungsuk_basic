public class Ex7_7 {

	public static void main(String[] args) {
		Car c = new Car();
		FireEngine fe = (FireEngine)c;	//형변환 실행 에러 java.lang.ClassCastException
		fe.water();// 컴파일 오케이!
//		Car car = null;
//		FireEngine fe = null; //실제 인스턴스가 무엇인지가 중요.
//		
//		FireEngine fe2 = (FireEngine)car;	// 조상 -> 자손으로 형변환
//		Car car2 = (Car)fe2; 				// 자손 -> 조상으로 형변환
//		car2.stop();	//NullPointerException 발생.
		
//		FireEngine fe = new FireEngine();
//		FireEngine fe2 = null;
//		
//		fe.water();
//		car = fe; // car = (Car)fe;에서 형변환이 생략됨
////		car.water(); // 컴파일 에러!!! Car타입의 참조변수로는 water()를 호출할 수 없다.
//		fe2 = (FireEngine)car;	// 자손타입 ← 조상타입. 형변환 생략 불가
//		fe2.water();

	}

}

class Car {
	String color;
	int door;
	
	void drive() { //운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {	//멈추는 기능
		System.out.println("stop!!!!");
	}
}

class FireEngine extends Car {	//소방차
	void water() {	// 물을 뿌리는 기능
		System.out.println("Water!!!!");
	}
}