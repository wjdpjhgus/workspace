public class ValueRef{		

	public static void main(String[] args) {
		//Stack�� hello01 ���� Class��  Hello�� ����Ŵ 02�� ������
		String hello01 = "Hello";
		String hello02 = "Hello";
		//new ������ Heap������ ���� 03�̰���Ű�� ���� 01,02�� �ٸ���
		String hello03 = new String("Hello");

		System.out.println(hello01);
		System.out.println(hello02);
		System.out.println(hello03);

		//hello01�� hello02 �������� ��(==)
		if (hello01==hello02) {
			System.out.println("hello01�� hello02�� ����");
		}
		else{
			System.out.println("hello01�� hello02�� �����ʴ�");
		}

		//hello01�� hello03 �������� ��(==)
		if (hello01==hello03) {
			System.out.println("hello01�� hello03�� ����");
		}
		else{
			System.out.println("hello01�� hello03�� �����ʴ�");
		}

		//hello01�� hello03 �������� ����(equals �޼���)
		if (hello01.equals(hello03)) {
			System.out.println("hello01�� hello03�� ����");
		}
		else{
			System.out.println("hello01�� hello03�� �����ʴ�");
		}

	}
}