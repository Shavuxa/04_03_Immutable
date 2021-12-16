public class Product {

    private final String name;
    private int price;
    private final int barCode; //id штрих-кода - на изображение

    public Product(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public int getBarCode() {
        return price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
