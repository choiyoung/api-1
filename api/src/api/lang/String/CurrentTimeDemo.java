package api.lang.String;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.lang.System 에 속한
CurrentTime 
Rom에 내장된 시간을 리턴한다. 
*/public class CurrentTimeDemo {
		public static void main(String[] args) {
			 long curTime =System.currentTimeMillis();
		System.out.println(curTime);	 
		SimpleDateFormat dateFormat =new SimpleDateFormat("hh:mm");
		String nowTime =dateFormat.format(new Date(curTime));
				System.out.println(nowTime);
				
		}
}
