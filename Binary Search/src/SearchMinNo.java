public class SearchMinNo {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        System.out.println(Search(arr));
    }
    static int Search(int arr[]){
        int ans=arr[0];
        for(int i=0; i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;

    }
}
