import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Ex12_2 {

	public static void main(String[] args) {
//		HashMap map = new HashMap();	//JDK 1.7���� �����ڿ� Ÿ������ ��������
		HashMap<String, Student> map = new HashMap<>(); // JDK1.7���� �����ڿ� Ÿ�� ���� ���� ����
		map.put("�ڹٿ�", new Student("�ڹٿ�", 1, 1, 100, 100, 100));
		
		Student s = (Student)map.get("�ڹٿ�");
		
		System.out.println(map);
		System.out.println(map.get("�ڹٿ�"))  ;
	} //main
}

class Student {
	String name = "";
	int ban;	//��
	int no;		//��ȣ
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