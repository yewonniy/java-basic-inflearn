package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];
        for (int i=0; i<n; i++) {
            System.out.println(i+1 + "번째 주문정보를 입력하세요");
            System.out.println("상품명");
            String name = scanner.nextLine();

            System.out.println("가격");
            int price = scanner.nextInt();

            System.out.println("수량");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(name, price, quantity);
        }

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String name, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.name = name;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrders(ProductOrder[] productOrders) {
        for (ProductOrder order : productOrders) {
            System.out.println("상품명: " + order.name + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int result = 0;
        for (ProductOrder productOrder : productOrders) {
            result += productOrder.price * productOrder.quantity;
        }
        return result;
    }
}
