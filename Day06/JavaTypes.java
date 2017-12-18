public class JavaTypes {
	
	public static void main(String[] args) {
		
		
		// �з�			�ڷ���			���
		// ������		byte			(-128 ~ 127)
		// ������		short			(-32,768 ~ 32,767)
		// ������		int(�⺻��)		10����, 8����, 16���� (-2,147,483,648 ~ 2,147,483,647)
		// ������		long			32000L (���� �ڿ� L�� ����) (-2^63 ~ 2^63 -1)
		// �Ǽ���		float			(+,-)1.4E^-45 ~ 3.4028235E^38 (���� �ڿ� F�� ����)
		// �Ǽ���		double(�⺻��)		(+,-)4.9E^-324 ~ 1.7976931348623157E^308
		// ���ڿ�		String			ū ����ǥ�� ǥ�� 
		// ����			char			���� ����ǥ�� �ѱ��ڸ� ǥ��
		// �ο�			boolean			true, false
		
		// ������
		int intValue = 0;
		int num01 = 10; 
		int num02 = 010;			//8���� 8�� ǥ��
		int num03 = 0x10;			//16���� 16�� ǥ��
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;
		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);
		
		//�Ǽ���
		float floatVal = 3.14F;
		double doubleVal = 256.12;
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		//������
		String StringValue = "�ȳ��ϼ���.";
		String bye = "�ȳ��� �輼��.";
		System.out.println(StringValue);
		System.out.println(bye);		
		
		// ����
		char character = 'A';
		System.out.println(character);
		
		// �ο�-true�� �������� �˷��ִ� ������ ���ڰ� �ƴ� �׷��� ""�տ� �־��༭ ���ڷ� �ٲ��ټ� �̾�

		boolean trueVal = true;
		boolean falseVal = false;
		System.out.println(trueVal);
		System.out.println(falseVal);

		//!= �� !�� not�̶�� �ǹ� �׷��� TRUE��� ����
		boolean result = 1 == 2; 
		boolean result2 = 1 != 2; 
		System.out.println(result);
		System.out.println(result2);


		if (10 == 11 && "��찳" == "��찳" && "����" == "������") {
		
		}

		boolean isEqualNumber = 10 == 11;
		boolean isEqualType = "��찳" == "��찳";
		boolean	isEqualName = "����" == "������";
		if (isEqualNumber && isEqualType && isEqualName){

		}

		byte byteRes = (byte)129; 	//int���� ������ byteŸ������ ����-byte�� 127�������ڰ� -128�̵� ������ �����Ƿ� ��ȯ��
		System.out.println(byteRes); 
		
		short shortRes = (short)32768;	//int ������ ������ short������ ��ȯ
		System.out.println(shortRes);
				
		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01;	//float�� int������ ����ȯ
		System.out.println(intVal01);

		int charNum = 'A';  		//char->int ����ȯ maping A��65������Ǿ�����
		System.out.println(charNum);



	}
}
		