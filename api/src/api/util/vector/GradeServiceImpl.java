package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GradeService {
	Vector<Object> vector= new Vector<Object>();
	GradeVO vo = new GradeVO();
    
	
	@Override
	public void input(GradeVO vo) {
		// TODO Auto-generated method stub
		vector.addElement(vo);
	}
    /*
	����ǥ�� ����ϴ� �޼ҵ�
	vo.toString ���� ó�� �����ϰ� ����.
	
	
	*/@Override
	public void print() {
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.elementAt(i);
		}
		for (int j = 0; j < gradeVO.length; j++) {
			System.out.println(gradeVO[j].toString() + "���� :"
					+ gradeVO[j].getTotal());
		}

		
	}
	/*
    �й����� �˻��ϴ� ������� ���� �޼ҵ�	
	
*/
	@Override
	public String searchByHak(String hak) {
		int j = 0;
		/// vector �����ŭ �迭 ũ��
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		// vector�ȿ� ���� ��� vo ������ ����
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		// �׷��� ���� ã�� �й��� ��ġ�Ұ�� j ��
		for (j = 0; j < gradeVO.length; j++) {
			if (gradeVO[j].getHak() == hak) {
				break;
			}
		}
		// �׷��� ���� ã�� �й��� ��ġ�Ұ�� j ��
		vo = (GradeVO) vector.elementAt(j);

		return vo.toString();
	}
/*
�̸� ���� ������ �˻��ؼ� ����ϴ� �޼ҵ�	
	 
	
*/	@Override
	public Vector<String> searchGradeByName(String name) {
	Vector<String> vec = new Vector<String>();
	GradeVO[] gradeVO = new GradeVO[vector.size()];
	for (int i = 0; i < vector.size(); i++) {
		gradeVO[i] = (GradeVO) vector.elementAt(i);
	}
	for (int i = 0; i < gradeVO.length; i++) {
		if (gradeVO[i].getName() == name) {
			vec.removeAllElements();
			vec.add(gradeVO[i].toString());
			break;
		} else {
			vec.removeAllElements();
			vec.add("�����ϴ�.");
		}
	}
	return vec;
	}
/*
�������� �������� ������������ ���Ľ�Ű�� �޼ҵ� 

*/	@Override
	public void descGradeTotal() {
	GradeVO temp = null;
	GradeVO[] gradeVO = new GradeVO[vector.size()];
	// vector�ȿ� ���� ��� vo ������ ����
	for (int i = 0; i < vector.size(); i++) {
		gradeVO[i] = (GradeVO) vector.get(i);
	}
	for (int j = 0; j < vector.size(); j++) {
		for (int k = j + 1; k < gradeVO.length; k++) {
			if (gradeVO[j].getTotal() > gradeVO[k].getTotal()) {
				temp = gradeVO[j];
				gradeVO[j] = gradeVO[k];
				gradeVO[k] = temp;

			}
		}

	}
	System.out.println();
	for (int i = 0; i < gradeVO.length; i++) {
		System.out.println(gradeVO[i].toString()+"����:"+gradeVO[i].getTotal());
	}
		
	}
/*
�������� �������ο����������� ���Ľ�Ű�� �޼ҵ� 

*/	
	@Override
	public void ascGradeTotal() {
		GradeVO temp = null;
		GradeVO[] gradeVO = new GradeVO[vector.size()];
		for (int i = 0; i < vector.size(); i++) {
			gradeVO[i] = (GradeVO) vector.get(i);
		}
		for (int j = 0; j < vector.size(); j++) {
			for (int k = j + 1; k > gradeVO.length; k++) {
				if (gradeVO[j].getTotal() > gradeVO[k].getTotal()) {
					temp = gradeVO[j];
					gradeVO[j] = gradeVO[k];
					gradeVO[k] = temp;

				}
			}

		}
		System.out.println();
		for (int i = 0; i < gradeVO.length; i++) {
			System.out.println(gradeVO[i].toString() +"����:"+gradeVO[i].getTotal());
		}
	}
		
	}


