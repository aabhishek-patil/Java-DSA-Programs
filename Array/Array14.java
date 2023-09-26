import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        int a[] = {91,52,73,56,87,23,34,23,87};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a index range between 0 to "+(a.length-1)+" : ");
        int n = input.nextInt(), m = input.nextInt();
        int sum=0,max=0,min=a[n];
        for(int j=n;j<=m;j++)
        {
            sum+=a[j];
            if(max<a[j])
                max=a[j];
            else if(min>a[j])
                min=a[j];
        }
        System.out.println("Sum of elements in a range is : "+sum);
        System.out.println("Average of elements of a given range is : "+(sum/(m+1-n)));
        System.out.println("Minimum element in a range is : "+min);
        System.out.println("Maxixmum element in a range is : "+max);
    }
}
