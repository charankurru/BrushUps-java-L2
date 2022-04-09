public class OrderModel {
    private String itemcode;
    private String itemName;
    private int price;

    public String getItemcode() {
        return itemcode;
    }

    public void setItemcode(String itemcode) {
        this.itemcode = itemcode;
    }

    public OrderModel(String itemName, int price, String itemcode) {
        this.itemName = itemName;
        this.price = price;
        this.itemcode = itemcode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
