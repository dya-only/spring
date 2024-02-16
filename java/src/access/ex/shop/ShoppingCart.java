package access.ex.shop;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count;

    public ShoppingCart() {}

    public void addItem(Item item) {
        if (count >= items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items[count++] = item;
    }

    public void displayItems() {
        System.out.println("=== 장바구니 상품 목록 ===");

        for (Item item : items) {
            if (item == null) continue;
            System.out.println("상품명: " + item.getName() + ", 합계: " + item.getTotalPrice() + ", 수량: " + item.getCount());
        }

        System.out.println("총합 가격: " + getTotalPrice());
    }

    private int getTotalPrice() {
        int price = 0;
        for (Item item : items)
            if (item != null)
                price += item.getTotalPrice();

        return price;
    }
}