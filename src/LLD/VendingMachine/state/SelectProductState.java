package LLD.VendingMachine.state;

import LLD.VendingMachine.Cash;
import LLD.VendingMachine.Product;
import LLD.VendingMachine.VendingMachine;

import java.util.ArrayList;

public class SelectProductState implements State {

    VendingMachine vendingMachine;

    public SelectProductState(VendingMachine vendingMachine) {
        System.out.println("Select product state");
        this.vendingMachine = vendingMachine;
        this.vendingMachine.setMoney(new ArrayList<>());
        this.vendingMachine.setSelectedProduct(null);
    }

    @Override
    public void selectProduct(int productCode) {
        for(Product product: this.vendingMachine.getProducts()){
            if(product.getProductCode() == productCode ){
                if(product.getStock()>0) {
                    System.out.println("Product "+productCode+" "+product.getName()+" selected");
                    this.vendingMachine.setSelectedProduct(product);
                    this.vendingMachine.setState(new InsertCashState(this.vendingMachine));
                    return;
                }else{
                    System.out.println("Product "+productCode+" out of stock");
                }
            }
        }
        System.out.println("Product "+productCode+" not found");
    }

    @Override
    public void insertCash(Cash cash) {
        System.out.println("insertCash Not allowed");
    }


    @Override
    public void dispenseProduct() {
        System.out.println("dispenseProduct Not allowed");
    }

    @Override
    public void cancel() {
        System.out.println("cancel Not allowed");
    }
}
