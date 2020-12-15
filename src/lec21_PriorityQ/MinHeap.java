package lec21_PriorityQ;

import java.util.ArrayList;

public class MinHeap<T> {
ArrayList<NodePQ<T>> list;
	

	public MinHeap()
	{
		list =new ArrayList<>();
	}
	public int size(){
		return list.size();
	}
public boolean isEmpty(){
	return list.size()==0;
}
public T Min() throws Exception
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
   	 
   	 if(parent.priority<=child.priority)
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
	
	int minIndex=index;
	if(list.get(leftchildIndex).priority<list.get(index).priority)
		minIndex=leftchildIndex;
	if(rightchildIndex<size()&&list.get(rightchildIndex).priority<list.get(minIndex).priority)
		minIndex=rightchildIndex;
	if(minIndex!=index)
	{
		NodePQ<T> temp=list.get(minIndex);
		list.set(minIndex, list.get(index));
		list.set(index, temp);
		downheapify(minIndex);
	}
}

}
