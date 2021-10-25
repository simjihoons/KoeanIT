package ch2;

public class Bank {

	// ���� ����
	// �ʿ信 ���� get,set ����
	private int balance; // �ܾ�

	// �Ա� �޼���
	public void deposit(int money) {
		this.balance += money;
		// System.out.println(money+"�� �Ա�\n");
	}

	// ��� �޼���
	public int withdraw(int money) {
		this.balance -= money;
		// System.out.println(money+"�� ���\n");
		return balance;
	}

	// �ܾ� ����
	public void showMoney() {
		System.out.println("���� �ܾ��� : " + this.balance + "�� �Դϴ�.");

	}

	// getter �޼��� ���� , ��������� ���� ������ �޼��带 ���ؼ� �Ѱ��ش�.
	// �Ϲ������� get() �޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� ����
	public int getBalance() {
		return this.balance;
	}

	// setter �޼��� ����
	// �Ϲ������� set() �޼��带 �����ؼ� �ܺο��� ��� ������ ������ �� �ֵ��� ����
	public void setBalance(int balance) {
		if(balance <0) {
			System.out.println("�߸��� �Է� �Դϴ�.");
		}else {
			this.balance = balance;
		}
		
	}

}
