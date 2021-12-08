import java.util.ArrayList;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

class Ex12_1 {
	public static void main(String[] args) {
		ArrayList<Product>	productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product>	tvList = new ArrayList<Tv>(); //����.
//		List<Tv>	tvList = new ArrayList<Tv>();	// ����.
		
		productList.add(new Tv());	// public boolean add(Product e) {
		productList.add(new Audio());
		
		tvList.add(new Tv());	//public boolean add(Tv e) {
		tvList.add(new Tv());
//		tvList.add(new Audio());	// ����
		
//		printAll(productList);
		printAll(tvList);	// ������ ������ �߻��Ѵ�.
	}
	
	public static void printAll(ArrayList<Tv> list) {
		for (Product p : list)
			System.out.println(p);
	}

}
