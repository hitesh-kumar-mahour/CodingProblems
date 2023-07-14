package LLD.VendingMachine.state;

import LLD.VendingMachine.Cash;

public interface State {
    void selectProduct(int productCode);
    void insertCash(Cash cash);
    void dispenseProduct();
    void cancel();
}
