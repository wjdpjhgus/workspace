public class For {

	public static void main(String[] args) {
		
		//(1)���ڸ� ���������� ��ȯ�ؼ� AZ���� ���
		for (int i = 65; i < 91; i++) {
				   //��ȯ�ϰ������()	
			char Num = (char)i;
			System.out.print(Num);//print������ ������ ���ln�� ����Ű
		}

			System.out.println();
	
		//(2)
		for (int i = 1; i <= 9; i++) {
			int Num1 = i;
			System.out.println("5 * "+ Num1 + " = " + 5 * Num1);
		}

		//(1-1)
		for (char i = 65; i < 91; i++) {	
			System.out.println(i);
		}

		
		//(2-1)
		for (int i = 1; i < 10; i++) {
			System.out.println("5 * "+ i + " = " + 5 * i);
		}

	 	//(2-2)
		for (int i = 1; i < 10; i++) {
		int result = 5 * i;
		String a = "5 *";
		String b = " = ";
		System.out.println(a+i+b+result);
		}
		//'H'�� ���
		for(char i = 65; i< 91; i++) {
			if (i == 'H') {
				System.out.print(i);
				break;//91�ɶ����� �ݺ��ϹǷ� ã���� �극��ũ�ɰ� �ߴܽ�Ű�°�
			}			

		}
		for(char i = 65; i< 91; i++) {
			if (i == 'E') {
				System.out.print(i);
				break;
			}			

		}	
		for(char i = 65; i< 91; i++) {
			if (i == 'L') {
				System.out.print(i);
				System.out.print(i);
				break;
			}			

		}
		for(char i = 65; i< 91; i++) {
			if (i == 'O') {
				System.out.print(i);
				break;
			}			

		}
	}
}