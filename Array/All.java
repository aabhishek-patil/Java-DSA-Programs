//+ve,-ve,odd,even,prime,armstrong,palindrome,perfect,neon.
import java.util.*;
class All{
	public static void main(String []arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int n=sc.nextInt();
		System.out.println("1=Positive/Negative");
		System.out.println("2=Odd/Even");
		System.out.println("3=Prime/not Prime");
		System.out.println("4=Armstrong/Not Armstrong");
		System.out.println("5=Palindrome/Not Palindrome");
		System.out.println("6=Perfect/Not Perfect");
		System.out.println("7=Neon/Not Neon");
		System.out.println("Enter The Choice:");
		int a=sc.nextInt();
        switch(a){
            case 1:

                 if(n>0){
                   System.out.println("The given number is positive");
                   break;
               }
               if(n<0){
                   System.out.println("The given number is negative");
                   break;
               }
               else{
                   System.out.println("The given number is zero");
               }
               break;
           case 2:
               if(n%2==0){
                   System.out.println("The given number is even");
               }
               else{
                   System.out.println("The given number is odd");
               }
               break;
           case 3:
                int m=2;
               while(m<n){
                   if(n%m==0){
                       break;
                   }
                   else{
                       m++;
                   }
               }
               if(m==n){
                   System.out.println("The given number is prime");
               }
               else{
                   System.out.println("The given number is not prime");
               }
               break;
           case 4:
                int c=0,k=n,r;
               while(n>0){
                   r=n%10;
                   c=c+r*r*r;
                   n=n/10;
               }
               if(c==k){
                   System.out.println("The given number is Armstrong");
               }
               else{
                   System.out.println("The given number is NOT Armstrong");
               }
               break;
           case 5:
               int s=0,d=n,b;
               while(n>0){
                   b=n%10;
                   s=s*10+b;
                   n=n/10;
               }
               if(s==d){
                   System.out.println("The given number is palindrome");
               }
               else{
                   System.out.println("The given number is NOT palindrome");
               }
               break;
           case 6:
               int l=2,f=1;
               while(n>l){
                   if(n%l==0){
                       f=f+l;
                       l++;
                   }
                   else{
                       l++;
                   }
               }
               if(f==n){
                   System.out.println("The given number is perfect");
               }
               else{
                   System.out.println("The given number is Not a perfect number");
               }
               break;
           case 7:
               int e=0,p=n*n,g;
               while(p>0){
                   g=p%10;
                   e=e+g;
                   p=p/10;
               }
               if(e==n){
                   System.out.println("The given number is neon");
               }
               else{
                   System.out.println("The given number is NOT neon");
               }
               break;	
           
                   
       }
   }
}


