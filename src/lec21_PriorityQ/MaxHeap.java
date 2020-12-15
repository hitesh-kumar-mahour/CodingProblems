package lec21_PriorityQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap<T> {

	private ArrayList<NodePQ<T>> list;
	

	public MaxHeap()
	{
		list =new ArrayList<>();
	}
	
	public int size(){
		return list.size();
	}
	public boolean isEmpty(){
		return list.size()==0;
	}
	public T Max() throws Exception
	{
		if(size()==0)
		{
			throw new Exception();
		}
		return list.get(0).data;
	}
	public void insert(T data,int priority){
	     NodePQ<T> newNode= new NodePQ<>();
	     newNode.data=data;
	     newNode.priority=priority;
	     list.add(newNode);
	     int childIndex=list.size()-1;
	     int parentIndex=(childIndex-1)/2;
	     
	     while(childIndex>0)
	     {
	    	 NodePQ<T>child=list.get(childIndex);
	    	 NodePQ<T>parent=list.get(parentIndex);
	    	 
	    	 if(parent.priority>=child.priority)
	    		 return;
	    	 else
	    	 {
	    		 list.set(parentIndex,child);
	    		 list.set(childIndex,parent);
	    	 }
	    	 childIndex=parentIndex;
	    	 parentIndex=(childIndex-1)/2;
	     }
	}
	
	public T remove() throws Exception
	{
		if(isEmpty())
			throw new Exception();
		T temp=list.get(0).data;
		list.set(0,list.get(size()-1));
		list.remove(size()-1);
		downheapify(0);
	
		return temp;
	}
	
	private void downheapify(int index)
	{
		int leftchildIndex=2*index+1;
		int rightchildIndex=2*index+2;
		if(leftchildIndex>=size())
		return;
		
		int maxIndex=index;
		if(list.get(leftchildIndex).priority>list.get(index).priority)
			maxIndex=leftchildIndex;
		if(rightchildIndex<size()&&list.get(rightchildIndex).priority>list.get(maxIndex).priority)
			maxIndex=rightchildIndex;
		if(maxIndex!=index)
		{
			NodePQ<T> temp=list.get(maxIndex);
			list.set(maxIndex, list.get(index));
			list.set(index, temp);
			downheapify(maxIndex);
		}
	}
	
}
