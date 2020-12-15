package assignment15heaps;


import lec21_PriorityQ.MaxHeap;
import lec21_PriorityQ.MinHeap;

public class MedianHeap {

	 MaxHeap<Integer>Lheap;
	 MinHeap<Integer>Rheap;
	 int median=0;
	
	public MedianHeap() {
		Rheap=new MinHeap<>();
		Lheap=new MaxHeap<>();
		
	}
	
	public int sizediff()
	{
		return Lheap.size()-Rheap.size();
	}
	 public int size()
	 {
		 return Lheap.size()+Rheap.size();
	 }
	 
	 public boolean isEmpty()
	 {
		 return size()==0;
	 }
	 
	 
	 public void insert(int data) throws Exception
	 {
		if(size()==0)
		{
			Lheap.insert(data, data);
			median=data;
		}
		else
		{
			if(data<=median)
			{
				Lheap.insert(data, data);
				if(sizediff()>1)
				{	int temp =Lheap.remove();
				    Rheap.insert(temp, temp);
				}
			}
			
			else
			{
				Rheap.insert(data, data);
				if(sizediff()<-1)
				{
					int temp=Rheap.remove();
					Lheap.insert(temp,temp);
				}
			}
	
//	deciding median	
			if(sizediff()==0)
				median=(Lheap.Max()+Rheap.Min())/2;
			else if(sizediff()>0)
				median=Lheap.Max();
			else
				median=Rheap.Min();
		}
	 
	 }
	 
	public  void remove() throws Exception
	{
		if(size()==0)
		{
			median=0;
			return;
		}
		int sizediff=sizediff();
		
		if(sizediff==0)
		{
			Rheap.remove();
			Lheap.remove();
					
		}
		else if(sizediff>0)
		{
			Lheap.remove();
		}
		else
			Rheap.remove();
	
		if(size()==0)
			median=0;
		else if(Rheap.size()==0)
			median=Lheap.Max();
		else if(Lheap.size()==0)
			median=Rheap.Min();
		else
			median=(Lheap.Max()+Rheap.Min())/2;
	
	}
	 
}
