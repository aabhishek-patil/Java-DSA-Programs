//pat1
class pat1{
	public static void main(String []arg){
		int n=5;
		char k='O';
		for(int i=1;i<=n;i++){
			char l=k;
			for(int j=1;j<=i;j++){
				System.out.print(l);
				l++;
			}
			for(int a=0;a<=i;a++){
				k--;
			}
			System.out.println("");
		}
	}
}
