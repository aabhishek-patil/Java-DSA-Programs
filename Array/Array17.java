//question and answer.
import java.util.Scanner;
class Array17{
	public static void main(String []arg){
		int c=0;
		String question[]=new String[10];
		question[0]="If a=20 and b=10 then a+b is equal to";
		question[1]="If a=20 and b=10 then a-b is equal to";
		question[2]="If a=20 and b=5 then a*b is equal to";
		question[3]="If a=10 and b=2 then a/b is equal to";
		question[4]="If a=1,b=2 and c=3 then a+b+c is equal to";
		question[5]="If a=1 and b=20 then (a+b)**2 is equal to";
		question[6]="If a=10  then 3a is equal to";
		question[7]="If a=10 and b=3 then a%b is equal to";
		question[8]="If a=1 and b=2 then a*b is equal to";
		question[9]="If k=5 and r=2 then (k-r)**3 is equal to";
		int answer[]={30,10,100,5,6,441,30,1,2,27};
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<question.length;i++){
			
				System.out.println(question[i]);
				int a=sc.nextInt();
				if(a==answer[i]){
					c++;
				}
			
		}
		System.out.println("Total score is "+c+"/10");
	}
}
