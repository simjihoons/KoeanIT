package ch2;

public class BankMainTest {

	public static void main(String[] args) {
		Bank bk1 = new Bank();

		bk1.deposit(10_000);
		bk1.showMoney();

		bk1.withdraw(5_000);
		bk1.showMoney();

		// ������ �Ǽ��� ��� ������ �ٷ� �����ؼ� �ܾ��� ������
		// �ܾ��� 105_000�� �Ǿ�� �ϴµ� �������.
		// ���������ڸ� �̿��� ���������� �������� ���ϰ� private�� ����Ѵ�.
		// bk1.balance = 100_000;
		// bk1.showMoney();

		// getter,setter
		// read only
		int returnMoney = bk1.getBalance();
		System.out.println(returnMoney);

		// setter ���
		bk1.setBalance(-100);
		bk1.showMoney();

		// ��������������
		// �� 4������ �ִ�.
		// public - ������ ������ ���
		// default - ���� ��Ű�� ������ ������ ��� //������� �տ� �ƹ��͵� ���� �ʴ� ��
		// protected - ��Ӱ��迡�� ������ ��� �Ѵ�.
		// private - ���� Ŭ���� ���ο����� ���� ���� ( �ܺ� Ŭ����, ��� ������ Ŭ���������� ���� �Ұ�)

		// public Ŭ������ .java ���� �ȿ��� �ϳ��� ��밡���ϴ�.
		
	}

}
