package ch_3_while;

public class whileMainTest {

	public static void main(String[] args) {
		//1~10���� ��
		int num = 1;
		int sum = 0;
		while(num<=10) {
			System.out.println("���� �� : "+num);
			sum += num;
			num++;
			
			try {//����ó��
				Thread.sleep(500);//0.5�� ()�� �и������� ����
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end of while
		System.out.println("������ ��� ���� : "+sum+"�Դϴ�.");
		
	}//end of main

}
