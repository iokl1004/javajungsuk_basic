import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc"); //중복이라 저장안됨.
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
		
		System.out.println(set);
	}

}

//equals()와 hashCode()를 오버라이딩해야 Hashset
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
		
		// 나자신(this)의 이름과 나이를 p와 비교
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
