

public class Ex6_6 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {	//기본형 매개변수 (기본형 매개변수여서 읽기만 가능하며, 값을 바꿀수 없음)
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}

class Data { int x; }