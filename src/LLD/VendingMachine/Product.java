package LLD.VendingMachine;

public class Product {
    private final int productCode;
    private final String name;
    private int stock;
    private final int cost;

    public int getProductCode() {
        return productCode;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public int getCost() {
        return cost;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(int productCode, String name, int stock, int cost) {
        this.productCode = productCode;
        this.name = name;
        this.stock = stock;
        this.cost = cost;
    }
}
