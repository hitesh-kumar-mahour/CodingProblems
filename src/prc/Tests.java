package prc;

class Pen{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	int price;
	String color;
	Pen(int price, String color){
		this.price=price;
		this.color=color;
	}
}

public class Tests {

	public static void main(String[] args) {
		Pen p1=new Pen(10,"red"),	p2=new Pen(10,"red");
		
		System.out.println(p1.equals(p2));
	}

	
	
}
