package assignment15heaps;

public class MedianHeapUse {

	public static void main(String[] args) throws Exception {
		MedianHeap heap=new MedianHeap();
		int []a={5,15,1,3,16};
		for(int i:a)
			{
			heap.insert(i);
			System.out.println(heap.median);
			}
		
//		heap.remove();
//		System.out.println(heap.median);
//		
//		heap.remove();
//		System.out.println(heap.median);
	}
}
