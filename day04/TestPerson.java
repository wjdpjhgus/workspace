public class TestPerson {

	public static void main(String[] args) {

		Person sanghoon = new Person(861201, "정상훈", 32, "상도동");			Person gildong = new Person(900420, "홍길동", 28, "서울");			
		//참과 거짓을 저장하는 타입을 boolean이라고 함
		boolean isEqual = sanghoon.equals(gildong);
		System.out.println(isEqual);

		boolean isEquals02 = gildong.equal(sanghoon);
		System.out.println(isEquals02);
		
		
	}
}