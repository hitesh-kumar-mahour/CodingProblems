package lec12_genericUse;

public class StudentUse {

	public static<T extends compareInterface<T>> void bubbleSort(T[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
				if(arr[j+1].compareTo(arr[j])==1) /* for making decending use a[i]< a[j]  */
	            {
	                T k=arr[j+1];
	                arr[j+1]=arr[j];
	                arr[j]=k;
	            }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student [] arr=new Student[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=new Student(); 
			arr[i].age=20-i;
			arr[i].name=(char )(65+i);
		}
		bubbleSort(arr);
		
		for(int i=0;i<5;i++)
		System.out.println(arr[i].name+" "+arr[i].age);
	}

}
