package ch2;

public class FunctionMainTest2 {

    public static void main(String[] args) {
        sayHello("안녕하세요");
        System.out.println(calcSum());

        // int num1 = 10;
        // int num2 = 20;

        double total = addNum(42.123, 10.5);
        System.out.println("total : " + total);

        // quiz
        System.out.println(intAdd(10, 20, 30));
        System.out.println(doubleAdd(101.1, 200.1));
        printArticle("배고프다");
    }// end of main

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        int i;
        for (i = 1; i < 101; i++) {
            sum += i;

        }
        return sum;
    }

    public static double addNum(double n1, double n2) {
        double result = 0.0;

        result = n1 + n2;

        return result;
    }

    public static int intAdd(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }

    public static double doubleAdd(double d1, double d2) {
        double sum = d1 + d2;
        return sum;
    }

    public static void printArticle(String article) {
        System.out.println(article);
    }
}// end of class
