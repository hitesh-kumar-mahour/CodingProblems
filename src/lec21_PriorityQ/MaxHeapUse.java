package lec21_PriorityQ;


public class MaxHeapUse {

	public static void main(String[] args) throws Exception {

		int []input={1,2,3,4,7,5,9};
		MaxHeap<Integer> m=new MaxHeap<>();
		for(int i:input)
			m.insert(i, i);
	
		while(!m.isEmpty())
	System.out.println(m.remove());
	}

}
