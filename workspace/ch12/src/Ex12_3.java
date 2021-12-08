import java.util.ArrayList;

class Fruit implements Eatable {
	public String toString() { return "Fruit"; }
}

class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy				  { public String toString() { return "Toy";}}

interface Eatable {}

public class Ex12_3 {

	public static void main(String[] args) {
			FruitBox<? extends Fruit> fbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>();
//			FruitBox<Apple> -> FruitBox<? extends Fruit> 가능
			FruitBox<? extends Fruit> abox = new FruitBox<Apple>();
			
			FruitBox<Apple> appleBox = (FruitBox<Apple>)abox;	//OK. 경고발생
		
//		Box b = null;
//		Box<String> bStr = null;
//		
//		b = (Box)bStr;	//Box<String>	-> Box 가능 but 경고
//		bStr = (Box<String>)b;	// Box -> Box<String> 가능 but 경고
		
//		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
//		FruitBox<Apple> appleBox = new FruitBox<Apple>();
//		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		Box<Toy>	toyBox	= new Box<Toy>();	//OK
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple());
//		fruitBox.add(new Grape());
//		fruitBox.add(new Apple());
////		fruitBox.add(new Grape());	//에러. Grape는 Apple의 자손이 아님
//		
//		System.out.println("fruitBox="+fruitBox);
//		System.out.println("appleBox="+appleBox);
//		System.out.println("grapeBox="+grapeBox);
		
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();	//item을 저장할 list
	void add(T item) { list.add(item); }	//박스에 item을 추가
	T get(int i) 	{ return list.get(i); }	//박스에 item을 꺼낼때
	int size()		{ return list.size(); }
	public String toStrint() { return list.toString(); }
}