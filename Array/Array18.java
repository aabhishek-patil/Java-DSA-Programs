//items array.store price array .read quantity.
import java.util.Scanner;
class Array18{
	public static void main(String []arg){
		String item[]={"pen","pencil","rubber","sharpner","ruler"};
		int unit[]={10,5,5,7,12};
		Scanner sc=new Scanner(System.in);
		int quan[]=new int[item.length];
		for(int i=0;i<item.length;i++){
			System.out.println(item[i]);
		}
		int bill=0;
		int tquantity=0;
		System.out.println("Enter quantity for each item ");
		for(int j=0;j<item.length;j++){
				
				quan[j]=sc.nextInt();
		}
		int total=0;
		int q=0;
		for(int k=0;k<item.length;k++){
			tquantity=tquantity+quan[k];
			System.out.println(item[k]+" : "+unit[k]);
			bill=unit[k]*quan[k];
			q=q+bill;

		}
		System.out.println("total quantity="+tquantity);
		System.out.println("Total Bill : "+q);
	}
}

