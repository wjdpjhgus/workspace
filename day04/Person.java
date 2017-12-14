class Person {
	//인스턴스 변수, 멤버 변수	
	int ssn;	//주민번호
	String name;	//이름
	int age;	//나이
	String address; //주소

	//생성자 (Constructor)
	public Person(int ssn, String name, int age, String address  ) {
	
	this.ssn = ssn;
	this.name = name;
	this.age = age;
	this.address = address;

	}
	//주민번호를 기준으로 해서 두 사람이 같은지를 비교
	//[리턴타입][메소드명]({파라메터타입})[변수명] {
	boolean equals(Person p) {
		if (this.ssn == p.ssn) {
			return true;
		}

			return false;
	}
}