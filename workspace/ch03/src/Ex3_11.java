
public class Ex3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shortPi);
		
		System.out.println(pi);
		System.out.println(pi*1000);
		System.out.println(Math.round(pi*1000));
		System.out.println(Math.round(pi*1000)/1000); //3
		System.out.println((double)Math.round(pi*1000)/1000); // 3.142
		
		System.out.println((int)(pi*1000) / 1000.0); // 3.141

	}

}
 