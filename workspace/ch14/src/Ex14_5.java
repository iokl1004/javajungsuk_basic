import java.util.Comparator;
import java.util.stream.Stream;

public class Ex14_5 {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 2, 100),
				new Student("���ڹ�", 2, 150),
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 3, 290),
				new Student("���ڹ�", 3, 180)
				);
//		studentStream.sorted(Comparator.comparing(Student::getBan).reversed()//1. �ݺ� ����
//		studentStream.sorted(Comparator.comparing((s)-> s.getBan()).reversed()//1. �ݺ� ����
//		.thenComparing(Comparator.naturalOrder()).reversed())	//2. �⺻ ����
//		.forEach(System.out::println);

	}

}

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;

	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore);
	}

	String getName()	{ return name; }
	int getban()	{ return ban; }
	int gettotalScore()	{ return totalScore; }

	//���� ���������� �⺻ ���ķ� �Ѵ�.
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}