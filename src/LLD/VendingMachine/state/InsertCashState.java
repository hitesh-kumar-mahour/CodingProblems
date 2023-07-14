package LLD.VendingMachine.state;

import LLD.VendingMachine.Cash;
import LLD.VendingMachine.VendingMachine;

public class InsertCashState implements State {

    VendingMachine vendingMachine;

    public InsertCashState(VendingMachine vendingMachine) {
        System.out.println("Insert cash state");
        this.vendingMachine = vendingMachine;
        System.out.println("Insert cash = " + this.vendingMachine.getProductCost());
    }

    @Override
    public void selectProduct(int productCode) {
        System.out.println("selectProduct Not allowed");
    }

    @Override
    public void insertCash(Cash cash) {
        if (this.vendingMachine.getMoneySum()+cash.getValue() <= this.vendingMachine.getProductCost()) {
            this.vendingMachine.getMoney().add(cash);
        }else{
            System.out.println("Cash exceeding product cost");
        }
        if(this.vendingMachine.getMoneySum() < this.vendingMachine.getProductCost()){
            System.out.println("Insert cash = " + ( this.vendingMachine.getProductCost() - this.vendingMachine.getMoneySum() ));
        }else if(this.vendingMachine.getMoneySum() == this.vendingMachine.getProductCost()){
            this.vendingMachine.setState(new DispenseProductState(this.vendingMachine));
        }
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
