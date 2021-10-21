package ch1;

public class WarriorMainTest1 {
    public static void main(String[] args) {
        // int height; -->�������� , stack

        Warrior w1 = new Warrior();
        w1.height = 200;
        w1.power = 100;
        w1.name = "����1";
        w1.color = "�ʷϻ�";

        System.out.println(w1.height);
        System.out.println(w1.power);
        System.out.println(w1.name);
        System.out.println(w1.color);

        Warrior w2 = new Warrior();
        w2.height = 100;
        w2.power = 50;
        w2.name = "��������1";
        w2.color = "������";

        System.out.println(w2.height);
        System.out.println(w2.power);
        System.out.println(w2.name);
        System.out.println(w2.color);
    }
}
