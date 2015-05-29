package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {
	public static void main(String[] args) {
/*
구분자 혹은 문법 요소 단위를 	token 이라고하는데
특정 구분자를 지정하면 그것을 기준으로
잘라내는 클래스 와 메소드

		
*/
		String date = "2015/05/24";
     	StringTokenizer tok = new StringTokenizer(date,"/");
	/* 위생성자 파라미터 중 앞에것은 String 대상객체
	 * 뒤에것은 구분자
		
		*/int idx =0;
		/*
		
		while 
		*/while (tok.hasMoreElements()) {
			String token = tok.nextToken();
			System.out.println(""+token);
			
		}
	}
}
