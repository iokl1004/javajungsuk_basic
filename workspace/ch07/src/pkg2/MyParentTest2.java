package pkg2;
import pkg1.MyParent;	// ctrl + shift + o

class MyChild extends MyParent {
	public void printMembers() {
		//System.out.println(prv);	//����
		//System.out.println(dft);	//����
		System.out.println(prt);	//OK
		System.out.println(pub);	//OK

	}
}
public class MyParentTest2 {

	public static void main(String[] args) {
		MyParent p = new MyParent();
//		System.out.println(p.prv);	// ����
//		System.out.println(p.dft);	// ����
//		System.out.println(p.dft);	// ����
		System.out.println(p.pub);	// OK

	}

}
