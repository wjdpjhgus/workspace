public class TestPerson {

	public static void main(String[] args) {

		Person sanghoon = new Person(861201, "������", 32, "�󵵵�");			Person gildong = new Person(900420, "ȫ�浿", 28, "����");			
		//���� ������ �����ϴ� Ÿ���� boolean�̶�� ��
		boolean isEqual = sanghoon.equals(gildong);
		System.out.println(isEqual);

		boolean isEquals02 = gildong.equal(sanghoon);
		System.out.println(isEquals02);
		
		
	}
}