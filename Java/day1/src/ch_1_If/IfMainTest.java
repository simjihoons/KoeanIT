package ch_1_If;

public class IfMainTest {

	public static void main(String[] args) {
		//��� if
		//�־��� ���ǿ� ���� ������ �̷�� ������ �����Ѵ�.
		//����...�̶��
		
		//boolean flag = true;
		boolean flag = false;
		
		//if�� �ܵ� ��� ���
		if(flag) {
			System.out.println("���ǽ� ����� ture�̸� ����");
		}//end of if
		
		//if else�� 
		if(flag) {
			System.out.println("ture�̸� ����");
		}else {
			System.out.println("false�̸� ����");
		}
	
		
		//if else if else��
		int point = 59;
		
		if(point >= 90 ) {
			System.out.println("A���� �Դϴ�.");
		}else if(point >= 80){
			System.out.println("B���� �Դϴ�.");
		}else if(point >= 70){
			System.out.println("C���� �Դϴ�.");
		}else if(point >= 60){
			System.out.println("D���� �Դϴ�.");
		}else {
			System.out.println("F���� �Դϴ�.");
		}
		
		
		
			
	}

}
