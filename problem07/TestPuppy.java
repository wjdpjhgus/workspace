public class TestPuppy {

	public static void main(String[] args) {

		Puppy a = new Puppy("Dachshund", "����1", 4, "����");					
		Puppy b = new Puppy("Maltese", "����2", 5, "����");			
		//���� ������ �����ϴ� Ÿ���� boolean�̶�� ��
		boolean isEqual = a.equals(b);
		if(isEqual) {
			System.out.println("���� �������̴�.");//System.out.println(isEqual)-�Ҹ�������ϴ°�
		}
		else {
			System.out.println("�ٸ� �������̴�.");	
		}
	}
}