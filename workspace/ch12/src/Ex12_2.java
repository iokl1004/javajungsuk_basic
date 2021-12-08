import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Ex12_2 {

	public static void main(String[] args) {
//		HashMap map = new HashMap();	//JDK 1.7부터 생성자에 타입지정 생략가능
		HashMap<String, Student> map = new HashMap<>(); // JDK1.7부터 생성자에 타입 지정 생략 가능
		map.put("자바왕", new Student("자바왕", 1, 1, 100, 100, 100));
		
		Student s = (Student)map.get("자바왕");
		
		System.out.println(map);
		System.out.println(map.get("자바왕"))  ;
	} //main
}

class Student {
	String name = "";
	int ban;	//반
	int no;		//번호
	int kor;
	int eng;
	int math;

	Student(String name,int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}