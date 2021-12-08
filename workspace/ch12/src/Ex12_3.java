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
//			FruitBox<Apple> -> FruitBox<? extends Fruit> ����
			FruitBox<? extends Fruit> abox = new FruitBox<Apple>();
			
			FruitBox<Apple> appleBox = (FruitBox<Apple>)abox;	//OK. ���߻�
		
//		Box b = null;
//		Box<String> bStr = null;
//		
//		b = (Box)bStr;	//Box<String>	-> Box ���� but ���
//		bStr = (Box<String>)b;	// Box -> Box<String> ���� but ���
		
//		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
//		FruitBox<Apple> appleBox = new FruitBox<Apple>();
//		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		Box<Toy>	toyBox	= new Box<Toy>();	//OK
//		
//		fruitBox.add(new Fruit());
//		fruitBox.add(new Apple());
//		fruitBox.add(new Grape());
//		fruitBox.add(new Apple());
////		fruitBox.add(new Grape());	//����. Grape�� Apple�� �ڼ��� �ƴ�
//		
//		System.out.println("fruitBox="+fruitBox);
//		System.out.println("appleBox="+appleBox);
//		System.out.println("grapeBox="+grapeBox);
		
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();	//item�� ������ list
	void add(T item) { list.add(item); }	//�ڽ��� item�� �߰�
	T get(int i) 	{ return list.get(i); }	//�ڽ��� item�� ������
	int size()		{ return list.size(); }
	public String toStrint() { return list.toString(); }
}