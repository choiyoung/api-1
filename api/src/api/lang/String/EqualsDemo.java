package api.lang.String;

/*
 java.lang.String
 ==�� ��ü�� ���۷��� ���(hashcode table)�� ���Ѱ�
 ���ڿ��� ���� �񱳴� �ݵ�� equals() �޼ҵ带 �̿�.

 new �� �̿��ϸ� heap ������ ���ο� �޸𸮸� �Ҵ��ϰ�
 hashcode �� �����Ѵ�.,


 equals() : 



 */public class EqualsDemo {
	public static void main(String[] args) {
   //String ���� ���ͷ� ������ ���
		String str1="abc";
        String str2="abc";
    
    String result;
     result = ((str1 == str2) ? "1�� 2������" : "1��2���ٸ�000");
    String result2 = ((str1.equals(str2)) ? "1�� 2������" : "1��2���ٸ�000");
    //String ���� �����ڷ� ������ ���  
     System.out.println(result);
     System.out.println(result2);
    
     String str3 = new String("abc");
     String str4 = new String("abc");
     
     String result3 = ((str3 ==str4) ? "1�� 2������" : "1��2���ٸ�000");
     String result4 = ((str3.equals(str4)) ? "1�� 2������" : "1��2���ٸ�000");
     System.out.println(result3);
     System.out.println(result4);
    
    /*
   result3 �� ����� �ٸ����� ���� ���� 
   sTring Ŭ������ �����ڸ� �̿��Ͽ� ,String �ν��Ͻ��� ������ ��쿡�� 
   new �����ڿ� ���� �޸� �Ҵ��� �̷����� ������
     �׻� ���ο� String �ν��Ͻ��� �����ȴ�.
    �׷��� String Ÿ���� �����ڷ� ��ü�� �������� �ʰ�
    ���ͷ��� �����Ѵ�. 
   
   ���Ŭ���� ���� ���� constant pool �̶�� 
   ������� �־ , Ŭ���� ���� ���Ǵ� ��� ���з���
   ������� ����Ǿ��ִ�.
   ����ϰ��� �ϴ� ���ڿ��� ����鿡 �̹� �����ϴ� ��쿡�� ��
   ���ڿ��� �ּҰ��� ��ȯ�Ѵ�. 
    
    
    
   */
     String str5 = new String("abc");
     String str6 = "abc";
     
     String result5 = ((str5 ==str6) ? "1�� 2������" : "1��2���ٸ�000");
     String result6 = ((str5.equals(str6)) ? "1�� 2������" : "1��2���ٸ�000");
     System.out.println(result5);
     System.out.println(result6);
     
     
	}
}
