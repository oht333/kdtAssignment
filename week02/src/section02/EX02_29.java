package section02;

public class EX02_29 {

	public static void main(String[] args) {

		//float형 -> int형 강제 형 변환
		float f1 = 12345.67f;
		int i1 = (int) f1;
		System.out.println("[float -> int] f1의 값 :" + f1 + ", i1의 값 :" + i1);
		
		//double형 -> int형 강제 형 변환
		double d1 = 12345.678;
		int i2 = (int) d1;
		System.out.println("[double -> int] d1의 값 :" + d1 + ", i2의 값 :" + i2);
	}

}