package api.util.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberService {
	MemberVO vo = new MemberVO();
	Map<String, Object> map = new HashMap<String, Object>();

	/*
	 * ȸ������ ����� �ϴ� �޼ҵ� HashMap �� �ؾ� id ���� password �� ȣ���ϰڱ���.
	 */

	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		// TODO Auto-generated method stub
		/*
		 * �������� DB�� �����ϴ� ���ϰ� ��ġ�Ѵ�. ��, ���� Ȱ���ϸ鼭 �����ǰų� ������ ���ֱ⿡ ���� ���� �������� D
		 */
		vo.setName(name);
		vo.setPassword(password);
		vo.setId(id);
		vo.setAddr(addr);
		vo.setAge(age);
		/*
		1.ù��° ��������
		map.put(vo.getId(),vo.getPassword)	
		*/map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		//Ű�� ���� ���Ͽ��� �������� string ���� ���Ͻ�Ű����
		//int Ÿ������ ���� age �� String 
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
		/*
     2.�ι�° ���� ����
     map.put("age",vo.getAge())		
		
*/
	}

	/*
	 * ȸ������ �� �α��� ����� �ϴ� �޼ҵ� ���Ŀ� ���ٸ� ���� �����ϱ� �α��� ����, ���� �޽������� ���⿡�� ��������� ��.
	 */
	@Override
	public void login(String id, String password) {
		// TODO Auto-generated method stub
		/*
		3 ���� ��������
		map.get(id)  => �Ķ���� ������ �ݵ�� String ���� �ؾ� ��.
		
		
		*/  if(id.equals(map.get("id"))){
			  if(password.equals(map.get("password"))){
				  System.out.println("ȯ���մϴ�. . "+vo.getAddr()+"�� ��� "+vo.getAge()+"�� "+vo.getName()+"��...");
			  }else{
				  System.out.println("�н����尡 Ʋ���ϴ�.");
			  }
		  }else{
			  System.out.println("���� �����Դϴ�.");
		  }
		  

		// ��¹� ����
		// �Է��Ͻ� ID �� �������� �ʰų�, ��ġ���� �ʽ��ϴ�. �ٽ� �Է��� �ּ��� .
		// ����� �ٸ��ϴ�. �ٽ� �Է��ϼ��� .
		// ȯ���մϴ�. . ����ÿ� ��� 20�� ȫ�浿��...
	}

}
