class Ex6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;	//Tv �ν��Ͻ��� �����ϱ� ���� ���� t�� ���� (��ü����)
		t = new Tv();	//Tv �ν��Ͻ��� �����Ѵ�. (��ü����)
		t.channel = 7;	//Tv �ν��Ͻ��� ������� channel�� ���� 7�� ȣ�� (��ü���, �������)
		t.channelDown(); //Tv �ν��Ͻ��� �޼��� channelDown() �� ȣ���Ѵ�. (��ü���, �޼��� ���)
		System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
	}

}

class Tv {
		// Tv�� �Ӽ� (�������)
	String color;	// ����
	boolean power;	// �������� (on/off)
	int channel;	//ä��
	
	// Tv�� ���(�޼���)
	void power() { power = !power; }	// TV�� �Ѱų� ���� ����� �ϴ� �޼���
	void channelUp() { ++channel; }		// TV�� ä���� ���̴� ��� �ϴ� �޼���
	void channelDown() { --channel; }	// TV�� ä���� ���ߴ� ��� �ϴ� �޼���
}