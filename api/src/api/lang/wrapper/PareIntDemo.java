package api.lang.wrapper;

/*
 JDK1.5 부터 도입된 오토박싱 기능으로
 반환값이 기본형일 경우와 wrapper class 이면..
 서로 차이가 없다.
 그래서 pareint()와 valueOf()의 차이가 없다.


 */public class PareIntDemo {
	public static void main(String[] args) {
     //리터럴값을 기본형으로 캐스팅시 변환방법
	 //즉 String =>int
		int num1 = Integer.parseInt("200");
		int num3 = Integer.parseInt("200");
		int result = num1+num3;
		System.out.println(result);
		//기본형을  참조형으로 형변환 하는 경우(캐스팅 생략가능)
		//Integer num3 =(Integer)result;
		Integer num4 = result;
		System.out.println("기본형을 참조형으로 형변환만 결과"+num4);
		int num5 =2+num3;
		System.out.println("참조형과 기본형간의 연산결과 :"+num5);
	}
}
