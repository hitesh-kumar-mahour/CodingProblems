package assignment10Stack_q;

import lec15_stacksNqueues.QueueEmptyException;

public class stack_use {

	public static void main(String[] args) throws QueueEmptyException {
	
		MinStack min_st=new MinStack();
		min_st.push(5);
		min_st.push(7);
		min_st.push(3);
		min_st.push(6);
		min_st.push(1);
		min_st.pop();
		min_st.pop();
		min_st.pop();
		min_st.pop();
		System.out.println(min_st.min());
		
	}

}
