package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1500, 2);

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
