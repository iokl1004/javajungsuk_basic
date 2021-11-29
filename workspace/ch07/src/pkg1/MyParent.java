package pkg1;

public class MyParent {	// 접근 제어자가 default, MyParent Class
	private int prv;	// 같은 클래스
			int dft;	// 같은 패키지
	protected int prt;	// 같은 패키지 + 자손(다른 패키지)
	public int pub;		// 접근제한 없음.
	
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
		//System.out.println(p.prv);	// 에러.
		System.out.println(p.dft);	// OK
		System.out.println(p.dft);	// OK
		System.out.println(p.pub);	// OK
	}

}
