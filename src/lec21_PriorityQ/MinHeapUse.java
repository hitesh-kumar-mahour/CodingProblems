package lec21_PriorityQ;

public class MinHeapUse {

	public static void main(String[] args) throws Exception {
		int []input={5,6,1,0,8,3};
		
		MinHeap<Integer>heap=new MinHeap<>();

		for(int i:input)
			heap.insert(i, i);
		while(!heap.isEmpty())
			System.out.println(heap.remove());
	}
}
