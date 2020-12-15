package lec12_genericUse;

public class Student implements compareInterface<Student>{
	
	
    char name;
	int age;

	public int compareTo(Student s)
	{
		if(this.age>s.age)
		return 1;
		else if(this.age<s.age)
			return -1;
		else 
			return 0;
	}
	
}
