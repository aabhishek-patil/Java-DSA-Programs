//in Maths directory
package Maths;
public class Mathsoperations{
	public static void max(int a,int b,int c){
		if(a>b&&a>c){
			System.out.println("Maximum:"+a);
		}
		else if(b>c){
			System.out.println("Maximum:"+b);
		}
		else{
			System.out.println("Maximum:"+c);
		}
	}	
	public static void min(int a,int b,int c){	
		if(a<b&&a<c){
			System.out.println("Minimum:"+a);
		}
		else if(b<c){
			System.out.println("Minimum:"+b);
		}
		else{
			System.out.println("Minimum:"+c);
		}
	}
}
//in Stats directory
package Stats;
public class Statsoperations{
	public static void average(int a,int b,int c){
		int s=a+b+c;
		System.out.println("Average: "+s/3);
	}
	public static void median(int a,int b,int c){
		int s=a+b+c;
		int max,min;
		if(a>b&&a>c){
			 max=a;
		}
		else if(b>c){
			 max=b;
		}
		else{
			max=c;
		}
		if(a<b&&a<c){
			 min=a;
		}
		else if(b<c){
			 min=b;
		}
		else{
			 min=c;
		}
		System.out.println("Median: "+(s-(max+min)));

	}
}
//packdemo18
import Maths.Mathsoperations;
import Stats.Statsoperations;
class Pack18{
	public static void main(String arg[]){
		Mathsoperations.max(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]),Integer.parseInt(arg[2]));
		Mathsoperations.min(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]),Integer.parseInt(arg[2]));
		Statsoperations.average(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]),Integer.parseInt(arg[2]));
		Statsoperations.median(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]),Integer.parseInt(arg[2]));
	}
}


