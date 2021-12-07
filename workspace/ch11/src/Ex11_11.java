import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); //�ߺ��̶� ����ȵ�.
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}

}

//equals()�� hashCode()�� �������̵��ؾ� Hashset
class Person {
	String name;
	int age;

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		
		// ���ڽ�(this)�� �̸��� ���̸� p�� ��
		return this.name.contentEquals(p.name) && this.age==p.age;
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	

	public String toString() {
		return name +":"+age;
	}
}
