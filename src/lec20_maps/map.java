package lec20_maps;

import java.util.ArrayList;
import java.util.Map;

import lec13_LinkedList.Node;

public class map <K,V>{
	
	public ArrayList<Node<MapPair<K, V>>> buckets;
	int size=buckets.size();
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	public V find(K key)
	{
		int bucketIndex=getBucketIndex(key);
		Node<MapPair<K, V>>head= buckets.get(bucketIndex);
		if(head==null)
			return null;
		
		Node<MapPair<K, V>>temp=head;
		while(temp!=null)
		{
			if(temp.data.key.equals(key))
				return temp.data.value;
			
			temp=temp.next;
		}
		
		return null;
	}
	public void put(K key,V value)
	{
		pair.key=key;
		pair.value=value;
		Node<MapPair<K, V>> newNode=new Node<MapPair<K,V>>(pair);
		if(head==null){
			buckets.set(bucketIndex, newNode);
			size++;
		}
		else
		{
		Node<MapPair<K, V>> temp=head,prev=null;
		while(temp!=null)
			{
			  if(temp.data.keyequals(key))
				{
				  temp.data.value=value
				  return;
				}
				prev=temp;
				temp=temp.next;
			}
		prev.next=newNode;
		size++;
		}
		double loadFactor=size*1.0/buckets.size();
		if(loadFactor>=0.75)
			rehash();
		}
	
	public void remove(K key)
	{
		int bucketIndex =getBucketIndex(key);
		Node<MapPair<K, V>> temp=buckets.get(bucketIndex);
		Node<MapPair<K, V>> head=temp;
		Node<MapPair<K, V>> prev=null;
		if(temp.data.key.equals(key))
		{
			prev.next=temp.next;
			return;
		}
		prev=temp;
		temp=temp.next;
	}
	private void rehash()
	{
		ArrayList<Node<Map<K, V>>>oldBuckets=buckets;
		buckets=new ArrayList<>();
		for(int i=0;i<2*oldBuckets.size();i++)
		buckets.add(null);
		
		size=0;
		for(Node<MapPair<K, V>>head:oldBuckets)
		{
			Node<MapPair<K,V>>temp=head;
			
		}
	}
	public int getBucketIndex(K key)
	{
		int hashCode=key.hashCode();
		int bucketIndex=hashCode%buckets.size();
		return bucketIndex;
	}
	
}

