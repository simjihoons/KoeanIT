package ch3;

public class Student {

    // 멤버 변수
    public int studentID;
    public String studentName;
    public String address;

    // 메서드
    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
