package api.lang.String;
/*
java.lang.String 에서
split("구분자")메소드
구분자를 기준으로 String 문자열을 분리하여
배열을 (ArrayList 포함)에 나눠 담는 기능
뒤에 숫자가 붙으면 단어사이 공백을 주고
없으면 디폴트로 다 공백을 준다.


*/import java.util.Arrays;

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
               System.out.println("\t"+fruits[i]);
		}
		System.out.println();
		System.out.println("split() 출력결과");
		
		String[] fruit2= fruit.split(",",1);
		
		System.out.println("공백1"+Arrays.toString(fruit2));
		String[] fruit3= fruit.split(",",2);
		System.out.println("공백2"+Arrays.toString(fruit3));
		String[] fruit4= fruit.split(",",3);
		System.out.println("공백3"+Arrays.toString(fruit4));
		
		String[] fruit5= fruit.split(",",4);
		System.out.println("공백4"+Arrays.toString(fruit5));
		
		/*for (int i = 0; i < fruit2.length; i++) {
               System.out.println("\t"+fruit2[i]);
		}*/
	}
}
