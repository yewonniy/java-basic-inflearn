package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int itemCount;

    public void addItem(Item item) {
        if (itemCount >= 10) {
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }


    public void displayItem() {
        System.out.println("장바구니 상품 출력");

        int total = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
            total += items[i].getTotalPrice();
        }

        System.out.println("전체 가격 합: "+ total);
    }
}
