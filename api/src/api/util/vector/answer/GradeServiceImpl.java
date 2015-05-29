package api.util.vector.answer;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	/*�޼ҵ帶�� �����ϴ� �ټ��� �� �� �ʿ��ѵ�
	�ѱ����� ������ �÷����� �ʵ忡 �����ؾ߰ڴ�.
	�ʵ忡 �����ؾ� �޼ҵ���� ���� ������ �� �����ϱ�..	*/
	private Vector<GradeVO>vc = new Vector<GradeVO>();
	GradeVO grade = new GradeVO();
	
	/*
	 * �л����� ������ �Է� �޴� ���ΰ�.. �׷� �Է¹޾Ƽ� ������ �����ε� �ѹ� �����ϸ� �߰��� �ø��� ������ �������� Ȯ���ϴ� �÷�����
	 * ���ä��߰ڱ� �׷��� ���� ���� �ƴ� �� ���� ���̴� ��Ÿ�� �־����.
	 */@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
       vc.add(vo);
	}

	// 2.print() ����ϴ� ���ΰ�. �׷� vo ��ü�� toString()�����;���
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(vc.toString());

	}

	/*
	 * 3-searchGradeByHak() �й����� ������ ��ȸ�ϴ� ����̱� �й��� ���� �� �л����Ը� �����ϹǷ� ���ϰ��� String
	 * ���״� ������ for loop +���ο� if �� �غ��߰ڴ�.
	 */@Override
	public String searchByHak(String hak) {
		 String msg= ""; //���������ϱ� �ʱ�ȭ
		 for (int i = 0; i < vc.size(); i++) {
			/*
			myHak �� ���Ϳ���    i��° ��ҿ��� �й��� �����Ͽ� ���� ���� String 
			
			*/
			 String myHak = vc.elementAt(i).getHak();
			
			/*
			�Ķ���ͷ� �޾ƿ� hak  �� ���Ϳ� ����ִ�
			myhak  �� ��ġ�ϴ��� ���θ� üũ�ϴ� ���� 
			
			*/if(myHak.equalsIgnoreCase(hak)){
				msg= hak;
				break;
			}else {
				msg = "��ȸ�ϴ� �й��� �ֽ��ϴ�.";
				break;
			}
			
		}
		 return msg;
	 }
	

	/*
	 * 4-searchGradeByName() �̸����� ������ȸ�ε� ���ϰ��� ������ ���� ���� �������� String �� ó���ϰԲ� ����
	 * �Ǿ��� ���ϰ��� �ϳ� �� �������� for loop + if ���������� ���Ϳ�� ��·����� ������ �װ� ��� �ٴ�.
	 */

	@Override
	public Vector<String> searchGradeByName(String name) {
		 Vector<String> msg = new Vector<String>(); //���������ϱ� �ʱ�ȭ
		 for (int i = 0; i < vc.size(); i++) {
			/*
			myHak �� ���Ϳ���    i��° ��ҿ��� �й��� �����Ͽ� ���� ���� String 
			
			*/String myName = vc.elementAt(i).getName();
			
			/*
			�Ķ���ͷ� �޾ƿ� hak  �� ���Ϳ� ����ִ�
			myhak  �� ��ġ�ϴ��� ���θ� üũ�ϴ� ���� 
			
			*/if(name.equalsIgnoreCase(myName)){
				msg.add(name);
				break;
			}else {
				msg.add("��ȸ�ϴ� �й��� �ֽ��ϴ�.");
				break;
			}
			
		}
		 return msg;
		
	}

	/*
	 * 5 - descGradeTotal() ���������ΰ�����
	 */
	@Override
	public void descGradeTotal() {
		// TODO Auto-generated method stub

	}
	/*6-ascGradeTotal 
	���������̸� Arrays.sort�� ���� �ǰڱ�*/
	@Override
	public void ascGradeTotal() {
		// TODO Auto-generated method stub

	}

}
