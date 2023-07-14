package LLD.VendingMachine.state;

import LLD.VendingMachine.Cash;
import LLD.VendingMachine.VendingMachine;

public class DispenseProductState implements State {

    VendingMachine vendingMachine;

    public DispenseProductState(VendingMachine vendingMachine) {
        System.out.println("Dispense Product State");
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(int productCode) {
        System.out.println("selectProduct Not allowed");
    }

    @Override
    public void insertCash(Cash cash) {
        System.out.println("insertCash Not allowed");
    }

    @Override
    public void dispenseProduct() {
        if (this.vendingMachine.getMoneySum() == this.vendingMachine.getProductCost()) {
            System.out.println("Please collect your product");
            this.vendingMachine.getSelectedProduct().setStock(this.vendingMachine.getSelectedProduct().getStock()-1);
            this.vendingMachine.setState(new SelectProductState(this.vendingMachine));
        }
    }

    @Override
    public void cancel() {
        System.out.println("cancel Not allowed");
    }
}
