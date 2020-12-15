package lec15_stacksNqueues;


public class stackUse {

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub

		StackUsingLL<Integer> st=new StackUsingLL<>();
		for(int i=0;i<5;i++)
		{
		st.push(i);
		}
		System.out.println("size "+st.size());
		for(int i=0;i<5;i++)
		System.out.println(st.pop()+" "+st.size());
	}

}
