package api.lang.String;
/*
java.lang.String 메소드



*/public class ReplaceDemo {
	public static void main(String[] args) {
     System.out.println("Hello Tom".replace("Tom", "Alex"));
     System.out.println("A B C D : A B C D".replaceAll(" C D", "E F"));
     /*
     위문법은 자바 버전 5(1.5) 까지의 문법입니다.
     버전 5이후 replace() 기능이 확대되어 replaceAll() 처럼
     복수의 글자에도 반응하게 되었습니다.
     그렇다면 차이점이 없냐? 아닙니다.
     정규식에 대한 기능이 있는지 없는지 여부에 따른 차이점이 있습니다.
  */	
     System.out.println("[1]A B C D : A B C D".replace(" C D", "E F"));
     System.out.println("[2]A B C D : A B C D".replaceAll(" C D", "E F"));
     
     System.out.println("[3]Hello Java!!".replace("!", ""));
     System.out.println("[4]Hello Java!!".replaceAll(" .!!", ""));
     //.의 역할은 정규식에서 쓰이는데 맨앞 한 글자만 지정합니다.
     //그러니깐 느낌표가 두개 있는데 맨 뒷에 한녀석만 남기겟다는 의미이고
     //이기능은  replaceAll() 에게만 있습니다.
     //따라서 replace()보다는 정규식 까지 처리기능한 replaceAll()을쓰라고
     //권장합니다. 
	}
	
	
}
