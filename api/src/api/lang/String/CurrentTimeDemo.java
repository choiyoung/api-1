package api.lang.String;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.lang.System �� ����
CurrentTime 
Rom�� ����� �ð��� �����Ѵ�. 
*/public class CurrentTimeDemo {
		public static void main(String[] args) {
			 long curTime =System.currentTimeMillis();
		System.out.println(curTime);	 
		SimpleDateFormat dateFormat =new SimpleDateFormat("hh:mm");
		String nowTime =dateFormat.format(new Date(curTime));
				System.out.println(nowTime);
				
		}
}
