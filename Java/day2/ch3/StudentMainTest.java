package ch3;

public class StudentMainTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentName = "이순신";
        studentLee.address = "부산";
        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentLee.studentName = "김유신";
        studentLee.address = "경주";
        studentLee.showStudentInfo();

        System.out.println("--------------");
        String name1 = studentKim.getStudentName();
        System.out.println("name1 : " + name1);

        String name2 = studentLee.getStudentName();
        System.out.println("name2 : " + name2);

    }
}
