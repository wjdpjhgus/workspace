public class JavaTypes {
	
	public static void main(String[] args) {
		
		
		// 분류			자료형			상수
		// 정수형		byte			(-128 ~ 127)
		// 정수형		short			(-32,768 ~ 32,767)
		// 정수형		int(기본형)		10진수, 8진수, 16진수 (-2,147,483,648 ~ 2,147,483,647)
		// 정수형		long			32000L (숫자 뒤에 L을 붙임) (-2^63 ~ 2^63 -1)
		// 실수형		float			(+,-)1.4E^-45 ~ 3.4028235E^38 (숫자 뒤에 F를 붙임)
		// 실수형		double(기본형)		(+,-)4.9E^-324 ~ 1.7976931348623157E^308
		// 문자열		String			큰 따옴표로 표기 
		// 문자			char			작은 따옴표로 한글자만 표기
		// 부울			boolean			true, false
		
		// 정수형
		int intValue = 0;
		int num01 = 10; 
		int num02 = 010;			//8진수 8을 표기
		int num03 = 0x10;			//16진수 16을 표기
		byte bNum01 = -128;
		short sNum01 = -32768;
		long lNum01 = -2147483648L;
		System.out.println(intValue);
		System.out.println(num01);
		System.out.println(num02);
		System.out.println(num03);
		System.out.println(bNum01);
		System.out.println(sNum01);
		System.out.println(lNum01);
		
		//실수형
		float floatVal = 3.14F;
		double doubleVal = 256.12;
		System.out.println(floatVal);
		System.out.println(doubleVal);
		
		//문자형
		String StringValue = "안녕하세요.";
		String bye = "안녕히 계세요.";
		System.out.println(StringValue);
		System.out.println(bye);		
		
		// 문자
		char character = 'A';
		System.out.println(character);
		
		// 부울-true는 참거짓을 알려주는 것이지 문자가 아님 그래서 ""앞에 넣어줘서 문자로 바꿔줄수 이씀

		boolean trueVal = true;
		boolean falseVal = false;
		System.out.println(trueVal);
		System.out.println(falseVal);

		//!= 는 !는 not이라는 의미 그래서 TRUE라고 나옮
		boolean result = 1 == 2; 
		boolean result2 = 1 != 2; 
		System.out.println(result);
		System.out.println(result2);


		if (10 == 11 && "삽살개" == "삽살개" && "해피" == "누렁이") {
		
		}

		boolean isEqualNumber = 10 == 11;
		boolean isEqualType = "삽살개" == "삽살개";
		boolean	isEqualName = "해피" == "누렁이";
		if (isEqualNumber && isEqualType && isEqualName){

		}

		byte byteRes = (byte)129; 	//int형을 강제로 byte타입으로 변경-byte는 127다음숫자가 -128이됨 셀수가 없으므로 순환됨
		System.out.println(byteRes); 
		
		short shortRes = (short)32768;	//int 형에서 강제로 short형으로 변환
		System.out.println(shortRes);
				
		float floatVal01 = 12.34F;
		int intVal01 = (int)floatVal01;	//float이 int형으로 형변환
		System.out.println(intVal01);

		int charNum = 'A';  		//char->int 형변환 maping A는65랑연결되어있음
		System.out.println(charNum);



	}
}
		