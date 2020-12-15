package oops_prc;

abstract class P{
	public static abstract void tests(); //abstract method can't be static
}

interface A{
	int x();
	int y();
	int z();
}

interface B{
	int x();
	int y();
	int z();
}

interface C extends A,B {
	int x();
	int y();
	int z();
	
}

private class prcOop implements A,B{
	
	int a;
	
	protected void p() {
	}
	
	protected int x() { // can't reduce visibility of inherited method
	
		return 0;
	}
	private int y() {
		return 0;
	}
	public int z() {
		return 0;
	}
	
	
}
