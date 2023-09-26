import java.util.Scanner;
class Full{
	public static void main(String args[]){
		FullTimeStaff a1=new FullTimeStaff();
		a1.fulldetailstaff ();
		PartTimeStaff  a2=new  PartTimeStaff();
		a2.partdetailstaff();
		
	}
}


class Staff{
	String name,address;
	Scanner sc=new Scanner(System.in);
	
}
class FullTimeStaff extends Staff{
	String department;
	int salary;
	FullTimeStaff(){
		System.out.println("enter Staff name:");
		name=sc.next();
		System.out.println("enter Staff address:");
		address=sc.next();
		System.out.println("enter department name:");
		department=sc.next();
		System.out.println("enter salary:");	
		salary=sc.nextInt();
	}
	void fulldetailstaff(){
		System.out.println(" name of staff:"+name);
		System.out.println(" address of staff:"+address);
		System.out.println(" department of staff:"+department);
		System.out.println(" salary of staff:"+salary);
	}
	
}
class PartTimeStaff extends Staff{
	int nohour,rateperhour;
	PartTimeStaff(){
		System.out.println("enter Staff name:");
		name=sc.next();
		System.out.println("enter Staff address:");
		address=sc.next();
		System.out.println("enter no of hour :");
		nohour=sc.nextInt();
		System.out.println("enter rate per hour:");	
		rateperhour=sc.nextInt();
	}
	void partdetailstaff(){
		System.out.println(" name of staff:"+name);
		System.out.println(" address of staff:"+address);
		System.out.println(" no:of hour of staff:"+nohour);
		System.out.println(" rate per hour:"+rateperhour);
	}
	
}

