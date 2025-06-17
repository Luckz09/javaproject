package aggregationexamples;

public class Teacher {
	
	int teacherId;
	String teacherName;
	Department details; //aggregation
	
	Teacher(int teacherId,String teacherName,Department details)
	{
		this.teacherId=teacherId;
		this.teacherName=teacherName;
		this.details=details;
	}
	public void display()
	{
		System.out.println("ID :"+teacherId);
		System.out.println("Name :"+teacherName);
		System.out.println(details.building+", "+details.deptName);
	}

	public static void main(String[] args) {
		Department obj=new Department("Computer Science","Block A");
		Teacher t1=new Teacher(11,"Ammu",obj);
		Teacher t2=new Teacher(12,"Achu",obj);
		Teacher t3=new Teacher(13,"Malu",obj);
		
		t1.display();
		t2.display();
		t3.display();
		
		
	}

}
