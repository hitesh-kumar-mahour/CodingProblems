package LLD.VendingMachine;

public enum Cash {

    ONE(1), TWO(2), FIVE(5), TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100);
    private final int val;

    Cash(int value) {
        this.val = value;
    }

    public int getValue(){
        return this.val;
    }
}
