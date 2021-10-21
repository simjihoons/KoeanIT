package ch2;

public class FunctionMainTest1 {
    public static void main(String[] args) {
        int addResult = add(10, 77);
        System.out.println(addResult);

        int addResult2 = add(10, 630);
        System.out.println(addResult2);

    }

    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
