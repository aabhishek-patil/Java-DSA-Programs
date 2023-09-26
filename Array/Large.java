//program to find maximum and minimum number from three
class Large{
	public static void main(String []arg){
		int a=Integer.parseInt(arg[0]);
		int b=Integer.parseInt(arg[1]);
		int c=Integer.parseInt(arg[2]);
		if(a>b&&a>c){
			System.out.println("Maximum:"+a);
		}
		else if(b>c){
			System.out.println("Maximum:"+b);
		}
		else{
			System.out.println("Maximum:"+c);
		}
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

