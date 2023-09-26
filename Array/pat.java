//print pattern 
class pat{
	public static void main(String []arg){
		for(int i=1;i<=3;i++){
			for(int j=3;j>i;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(" *");
			}
			System.out.println();	
		}
					
	}
}
