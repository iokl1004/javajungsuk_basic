
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int score = 100;
		//score = 200;
		boolean power = true;
		
		byte b = 127; // -128~127
		
		int oct = 010; //�տ� 0�� �پ����Ƿ�, 8����, 10�����δ� 8
		int hex = 0x10; // 16����, 10�����δ� 16
		
		long l = 10_000_000_000L;
		
		float f = 3.14f;
		double d = 3.14;
		System.out.println(f);
		System.out.println(d);

		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex);
		System.out.println(l);

		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(3e3);
		
		char ch = 'A';
		int i = 'A';
		
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
		System.out.println(str4);
		System.out.println(7+7+"");
		System.out.println(""+7+7);
	}

}
