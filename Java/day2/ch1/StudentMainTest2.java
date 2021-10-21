package ch1;

public class StudentMainTest2 {
    public static void main(String[] args) {
        Student sudent1 = new Student();

        sudent1.name = "ȫ�浿";
        sudent1.height = 180;
        sudent1.weight = 60;
        sudent1.grade = 4;

        System.out.println(sudent1.name);
        System.out.println(sudent1.height);
        System.out.println(sudent1.weight);
        System.out.println(sudent1.grade);

        System.out.println("---------------");

        Student sudent2 = new Student();

        sudent2.name = "�̼���";
        sudent2.height = 170;
        sudent2.weight = 80;
        sudent2.grade = 2;

        System.out.println(sudent2.name);
        System.out.println(sudent2.height);
        System.out.println(sudent2.weight);
        System.out.println(sudent2.grade);
    }
}
