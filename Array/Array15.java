import java .util.*;
import java.io.*;

class family{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of family:-");
		int c=sc.nextInt();
			int a[]=new int[c];
			System.out.println("enter age of "+ c +"family member");
			for(int i=0;i<c;i++){
				a[i]=sc.nextInt();
			}
			int min=a[0];
			int max=a[0];
			for(int i=0;i<c;i++){
				if(min>a[i]){
					min =a[i];
				}
				if(max<a[i]){
					max =a[i];
				}
			}
			System.out.println("Age of Youngest member:" +min);
			System.out.println("Age of Oldest member:" +max);
	}
}

