package access.ex.shop;

public class Item {
    private String name;
    private int price;
    private int count;

    public Item(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {
        return price * count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}