class Ex8_7 {
	public static void main(String[] args) {
		//üũ�� ����(����ó�� �ʼ�)
		try { //Exception�� �� �ڼ��� �ݵ�� ����ó���� ����� �Ѵ�. (�ʼ�)
			throw new Exception(); //Exception�� ���Ƿ� �߻���Ų��. / Unhandled exception type Exception ���� �߻�! ����ó���� ���ߴ�!
		} catch(Exception e) {	

		}
		
		// RuntimeException�� �� �ڼ��� ����ó���� ������ �ʾƵ� �������� �ȴ�.
		throw new RuntimeException();
	}
}