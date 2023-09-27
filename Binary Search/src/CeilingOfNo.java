public class CeilingOfNo {
    public static void main(String[] args) {
        int [] arr={2,3,4,6,7,9,10};
        System.out.println(Search(arr,5));
    }
    static int Search(int[]arr,int target){
        int start =0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target <= arr[mid]){
                end=mid-1;
            }
            else if(target>=arr[mid]){
                start=start+1;
            }
            else{
                return start;
            }
        }
        return start;
    }
}
