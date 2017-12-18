class Puppy {

 
	
	String type;

	String name;

	int age;

	String gender;

 
	
	public Puppy(String type, String name, int age, String gender) {

		this.type = type;

		this.name = name;

		this.age = age;

		this.gender = gender;

	 

	}
	
	//연산자 우선순위
	//0.논리곱:&&  논리합:||
	//1.+-*/
	//비교 메서드 만들기
	boolean equals(Puppy p) {
		
		if (this.type == p.type && this.name == p.name) {

			return true;
			
 

		}

			return false;
			
	}

	

}