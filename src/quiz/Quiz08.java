package quiz;

/*
 * <형변환>
 * 변수 두 개를 선언해서 10과 2.0을 대입하고
 * 두 변수의 사칙연산 결과를 '정수'로 출력하세요.*/

public class Quiz08 {

	public static void main(String[] args) {
		
		int i = 10;
		float f = 2.0f;
		
		//int result = i + f; -> 오류. float + float = float 가 됨
		int a = i + (int) f;
		int b = i - (int) f;
		int c = i * (int) f;
		int d = i /	(int) f;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		int a2 = (int) (i + f);
		int b2 = (int) (i - f);
		int c2 = (int) (i * f);
		int d2 = (int) (i / f);
		
		System.out.println(a2);
		System.out.println(b2);
		System.out.println(c2);
		System.out.println(d2);
		
	
		
	}

}
