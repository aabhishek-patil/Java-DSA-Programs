//east,west,south and north zonal sales of 12 months.
class Array16{
	public static void main(String []arg){
		int z[][]=new int[4][12];
		int k=0,max=0,w=0;
		String s[]={"East","West","South","North"};
		int total[]=new int[4];
		for(int i=0;i<4;i++){
			int sum=0;
			for(int j=0;j<12;j++){
				z[i][j]=Integer.parseInt(arg[k]);
				k++;
				sum=sum+z[i][j];
			}
			total[i]=sum;
		}
		for(int l=0;l<4;l++){
			System.out.println("Total of "+s[l]+" zone is : "+total[l]);
			System.out.println("Average of "+s[l]+" zone is "+(total[l]/12));
			if(max<total[l]){
				max=total[l];
				w=l;
			}
		}
		System.out.println("Name of zone with highest avrage is "+s[w]);
	}
}
