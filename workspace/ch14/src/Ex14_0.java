import java.util.Optional;

class Ex14_0 {
	public static void main(String[] args) {
//		int[] arr = null;
		int[] arr = new int[0];
		System.out.println("arr.length="+arr.length);
		
//		Optional<String> opt = null;	//OK. ������ �ٶ������� �ʴ�...
		Optional<String> opt = Optional.empty();
//		Optional<String> opt = Optional.of("abc");

		System.out.println("opt="+opt);
//		System.out.println("opt="+opt.get());
		
		String str = "����";
		
//		try {
//			str = opt.get(); //���� �߻�
//		} catch (Exception e) {
//			str ="";	//���ܰ� �߻��ϸ� �� ���ڿ�("")�� �ʱ�ȭ
//		}	//���ܹ߻�
		
//		str = opt.orElse("EMPTY");	//Optional�� ����� ���� null�̸� "" ��ȯ!
//		str = opt.orElseGet(()->new String());	//Optional�� ����� ���� null�̸� "" ��ȯ!
		str = opt.orElseGet(String::new);	//���� ���ٽ��� �޼ҵ� ������ �����ϸ� �̷��� ��!
		System.out.println("str="+str);
		
	}
}