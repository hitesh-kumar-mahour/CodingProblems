package LLD.VendingMachine;

import LLD.VendingMachine.state.SelectProductState;
import LLD.VendingMachine.state.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    List<Product> products;
    List<Cash> money;
    Product selectedProduct;

    public VendingMachine(List<Product> products) {
        this.products = products;
        this.state = new SelectProductState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setMoney(List<Cash> money) {
        this.money = money;
    }

    public State getState() {
        return state;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Cash> getMoney() {
        return money;
    }

    public int getMoneySum() {
        int sum=0;
        for(Cash cash: money){
            sum+=cash.getValue();
        }
        return sum;
    }

    public int getProductCost(){
        return this.selectedProduct.getCost();
    }
    public void setSelectedProduct(Product product) {
        this.selectedProduct = product;
    }

    public Product getSelectedProduct(){
        return this.selectedProduct;
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(101,"Coke", 5, 5));
        products.add(new Product(102,"Pepsi", 4, 6));
        products.add(new Product(104,"Kurkure", 10, 5));

        VendingMachine vm = new VendingMachine(products);

        vm.state.selectProduct(102);

        vm.state.insertCash(Cash.FIVE);
        vm.state.insertCash(Cash.ONE);

        vm.state.dispenseProduct();
    }
}
