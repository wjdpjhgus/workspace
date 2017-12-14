public class ValueRef{		

	public static void main(String[] args) {
		//Stack에 hello01 들어가고 Class에  Hello를 가리킴 02도 같은것
		String hello01 = "Hello";
		String hello02 = "Hello";
		//new 붙으면 Heap영역에 저장 03이가르키는 것은 01,02와 다른것
		String hello03 = new String("Hello");

		System.out.println(hello01);
		System.out.println(hello02);
		System.out.println(hello03);

		//hello01과 hello02 변수간의 비교(==)
		if (hello01==hello02) {
			System.out.println("hello01과 hello02는 같다");
		}
		else{
			System.out.println("hello01과 hello02는 같지않다");
		}

		//hello01과 hello03 변수간의 비교(==)
		if (hello01==hello03) {
			System.out.println("hello01과 hello03는 같다");
		}
		else{
			System.out.println("hello01과 hello03는 같지않다");
		}

		//hello01과 hello03 변수간의 비쿄(equals 메서드)
		if (hello01.equals(hello03)) {
			System.out.println("hello01과 hello03은 같다");
		}
		else{
			System.out.println("hello01과 hello03는 같지않다");
		}

	}
}