import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Ex14_0 {
	public static void main(String[] args) {
		// iterate(T seed, UnaryOperator f)	단항 연산자
		Stream<Integer> intStream = Stream.iterate(0,  n -> n + 2);
		intStream.limit(10).forEach(System.out::println);
		
		// generate(Supplier s) : 추가만 하는것 입력x, 출력O
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream
//		.limit(10)
		.forEach(System.out::println);
	}
}
