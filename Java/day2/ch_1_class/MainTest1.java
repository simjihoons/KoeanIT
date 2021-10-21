//package ch_1_class;

public class MainTest1 {
    public static void main(String[] args) {
        Order order1 = new Order();

        order1.orderId = 1;
        order1.buyerId = 10;
        order1.sellerId = 20;
        order1.productId = 5880;
        order1.orderDate = "2021-10-21";

        System.out.println(order1.orderId);
        System.out.println(order1.buyerId);
        System.out.println(order1.sellerId);
        System.out.println(order1.productId);
        System.out.println(order1.orderDate);

        UserInfo userInfo1 = new UserInfo();

        userInfo1.userId = "ghdrlfehd";
        userInfo1.ueserPassWord = "123123";
        userInfo1.userName = "홍길동";
        userInfo1.userAddress = "부산";
        userInfo1.tell = "010-1234-5678";

        System.out.println(userInfo1.userId);
        System.out.println(userInfo1.ueserPassWord);
        System.out.println(userInfo1.userName);
        System.out.println(userInfo1.userAddress);
        System.out.println(userInfo1.tell);
    }
}
