class MyPoint3 extends Object{
	int x;
	int y;
	
	MyPoint3(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	//ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "x:" + x + ", y:"+y;
	}
	
//	String getLocation() {
//		return "x :" + x + ", y :" + y;
//	}
}

//class MyPoint3D extends MyPoint3 {
//	int z;
//	
//	//������ getLocation()�� �������̵�
//	String getLocatin() {
//		return "x :" + x + ", y :" + y + ", z :" + z;	
//	}
//}

public class OverrideTest {
	public static void main(String[] args) {
		MyPoint3 p = new MyPoint3(3,5);
		System.out.println(p);
//		MyPoint3D p = new MyPoint3D();
//		p.x = 3;
//		p.y = 5;
//		p.z = 7;
//		System.out.println(p.getLocation());
	}
}
