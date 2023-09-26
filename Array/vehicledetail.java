import java.util.Scanner;
class vehicledetail{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of vehicles : ");
		int n=sc.nextInt();
		LighterMotorVehicle l[]=new LighterMotorVehicle[n];
		HeavyMotorVehicle h[]=new HeavyMotorVehicle[n];
		for(int i=0;i<n;i++)
        {
            l[i]=new LighterMotorVehicle();
 	         	h[i]=new HeavyMotorVehicle();
				l[i].ldetail();
 




           		h[i].hdetail();	
		}
		for(int i=0;i<n;i++){
			System.out.println("name of company:"+l[i].company+"\n"+"price of vehicle:"+l[i].price+"\n"+"mileage of vehicle:"+l[i].mileage);
			 System.out.println("  ");
		}
		for(int i=0;i<n;i++){
			System.out.println("name of company:"+h[i].company+"\n"+"price of vehicle:"+h[i].price+"\n"+"capacity of vehicle:"+h[i].capacity);
			 System.out.println("  ");
		}
	}
}

class Vehicle{
	String company;
	long price;
	Scanner sc=new Scanner(System.in);
	
}
class LighterMotorVehicle extends Vehicle{
	int mileage;
	public void ldetail(){
		System.out.println("enter the company name of vehicle:");
		company=sc.next();
		System.out.println("enter the price of vehicle: ");
		price=sc.nextLong();
		System.out.println("enter the milege of vehicle: ");
		mileage=sc.nextInt();
}
}
class HeavyMotorVehicle extends Vehicle{
	int capacity;
	public void hdetail(){
	System.out.println("enter the company name of vehicle:");
		company=sc.next();
		System.out.println("enter the price of vehicle: ");
		price=sc.nextLong();
		System.out.println("enter the capacity of vehicle: ");
		capacity=sc.nextInt();
	}
}

