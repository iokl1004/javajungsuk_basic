class Time {
	private int hour; // 0~23 ������ ���� ��������.
	private int minute;
	private int second;

	public void setHour(int hour) {
		if(isValidHour(hour)) return;
		
		this.hour = hour;
	}
	
	//�Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	//�� �ȿ����ۿ� �Ⱦ��̴ϱ� private�� ����Ѵ�.
	private boolean isValidHour(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() { return hour; };
}

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
//		t.hour = -100;
		t.setHour(21);	//hour�� ���� 21�� ����
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
		

	}

}
