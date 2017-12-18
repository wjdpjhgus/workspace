public class For {

	public static void main(String[] args) {
		
		//(1)숫자를 문자형으로 변환해서 AZ까지 출력
		for (int i = 65; i < 91; i++) {
				   //변환하고싶은것()	
			char Num = (char)i;
			System.out.print(Num);//print만쓰면 옆으로 출력ln은 엔터키
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
		//'H'를 출력
		for(char i = 65; i< 91; i++) {
			if (i == 'H') {
				System.out.print(i);
				break;//91될때가지 반복하므로 찾으면 브레이크걸고 중단시키는것
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