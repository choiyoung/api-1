package api.lang.String;

public class EqualsIgnoreCaseDemo {
	public static void main(String[] args) {
      System.out.println(
      		"Hello".equals("hello") ? "같습니다." : "다릅니다.") ;
      System.out.println(
        		"Hello".equalsIgnoreCase("hello") ? "같습니다." : "다릅니다.") ;
	}
}
