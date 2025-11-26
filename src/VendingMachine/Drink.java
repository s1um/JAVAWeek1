package VendingMachine;

public class Drink {
    private String name;
    private int price;
    private int stock;

    //수정
    public Drink(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void dispense() {
        if (this.stock > 0) {
            this.stock--;
        }
    }

    public void addStock(int quantity) {
        this.stock += quantity;
    }
}
