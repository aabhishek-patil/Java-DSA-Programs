public class Mynumber{
	private int n;
	Mynumber(){
		n=0;
	}
	Mynumber(int value){
		this.n=value;
	}
	public static void main(String arg[]){
		if(arg.length>0){
			int value=Integer.parseInt(arg[0]);
			Mynumber m=new Mynumber(value);
			m.isNegative();
			m.isPositive();
			m.isZero();
			m.isOdd();
			m.isEven();
		}
		else{
			Mynumber m=new Mynumber();
			m.isNegative();
			m.isPositive();
			m.isZero();
			m.isOdd();
			m.isEven();
		}
	}
	void isNegative(){
		if(this.n<0){
			System.out.println("Given number is Negative");
		}
	}
	void isPositive(){
		if(this.n>0){
			System.out.println("Given Number is Positive");
		}
	}
	void isZero(){
		if(this.n==0){
			System.out.println("Given Number is Zero");
		}
	}
	void isOdd(){
		if(this.n%2!=0){
			System.out.println("Given Number is Odd");
		}
	}
	void isEven(){
		if(this.n%2==0){
			System.out.println("Given Number is Even");
		}
	}
}

