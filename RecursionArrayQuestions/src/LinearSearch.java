public class LinearSearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,};
        int ans=search(arr,5,0);
        System.out.println(ans);
    }
    static int search(int[]arr,int target,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return search(arr,target,i+1);
    }
}
