public class TestPuppy {

	public static void main(String[] args) {

		Puppy a = new Puppy("Dachshund", "강쥐1", 4, "남자");					
		Puppy b = new Puppy("Maltese", "강쥐2", 5, "여자");			
		//참과 거짓을 저장하는 타입을 boolean이라고 함
		boolean isEqual = a.equals(b);
		if(isEqual) {
			System.out.println("같은 강아지이다.");//System.out.println(isEqual)-불리언값출력하는것
		}
		else {
			System.out.println("다른 강아지이다.");	
		}
	}
}