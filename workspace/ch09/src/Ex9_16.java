class Ex9_16 {

	public static void main(String[] args) {
		int i = 10;
		
		//�⺻���� ���������� ����ȯ (����ȯ ��������)
		Integer intg = (Integer)i;	// Integer intg = Integer.valueOf(i);
		Object obj = (Object)i;		// Object obj = (Object)Integer.valueOf(1);
		
		Long	lng = 100L;	// Long lng = new Long(100L);
		int i2 = intg + 10;	// �������� �⺻������ ���� ����
		long l = intg + lng; //������ ���� ������ ����
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;	// �������� �⺻������ ����ȯ�� ����(����ȯ ��������)
		
		//�⺻���� ������ ���� �ڵ���ȯ�� ���ִ°��� ����ڽ�&��ڽ��̴�
	}

}
