package api.lang.StringBuffer;

public class AppendDemo {
	/*
	 * StinrgBufferŬ���� String Ŭ������ �������� �ν��Ͻ� ������ ���ڿ��� �ٲܼ� �ְ� ���� �ִ�
	 * 
	 * 
	 * java.lang.StriBuffer �� �޼ҵ��� append () �Ķ���ͷ� ���� String ���� ���� ���ڿ��� �ڿ����δ�.
	 */
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer();
		StringBuffer buf1 = new StringBuffer("A B C");
		StringBuffer buf2 = buf1.append("D E F");
		String msg;

		if (buf1==buf2) {
			msg = "buf1 == buf2";
		} else {
			msg = "buf1 != buf2";
		}
		System.out.println(msg);
		System.out.println(buf1.toString());
		System.out.println(buf2.toString());
		/*
		buf 2 �� ���Ӱ� �����Ǿ� ���޵� ��ü�� �ƴϸ�
		buf 1 �� ���������� �����Ǿ� ���� �������ν�
		������ �ּҰ��� �����Ѵ�.
		
		��Ʈ������Ŭ������ String Ŭ������ �ٸ��� ���к��ϰ� ��ü ������ ���� �ʴ´�.
		���� ������ �� �ִ� �������� Ư¡�� �ִ�.
		�׷��Ƿ� ����� ���ڿ� ���� �۾��� �ʿ��� ��� 
		String Ŭ�������� StrinBuffer��Ŭ������ �������ϴ�.
		*/	
	}
}
