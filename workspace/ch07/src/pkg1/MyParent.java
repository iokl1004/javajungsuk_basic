package pkg1;

public class MyParent {	// ���� �����ڰ� default, MyParent Class
	private int prv;	// ���� Ŭ����
			int dft;	// ���� ��Ű��
	protected int prt;	// ���� ��Ű�� + �ڼ�(�ٸ� ��Ű��)
	public int pub;		// �������� ����.
	
	public void printMembers() {
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
		
	}
}
class MyParentTest { // MyParentTest Class

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv);	// ����.
		System.out.println(p.dft);	// OK
		System.out.println(p.dft);	// OK
		System.out.println(p.pub);	// OK
	}

}
