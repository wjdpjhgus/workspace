public class TestCalc {

	public static void main(String[] args) {
		
		
		Calc calcA =new Calc();
		
		int result = calcA.add(10,2);
		System.out.println(result);
		
		int result1 = calcA.sub(10,2);
		System.out.println(result1);
		
		int result2 = calcA.mul(10,2);
		System.out.println(result2);
		
		int result3 = calcA.div(10,2);
		System.out.println(result3);
	}
}

	