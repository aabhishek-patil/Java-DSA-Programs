public class AgnosticBS {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5,6};
        System.out.println(Search(arr,5));
    }
    static int Search(int []arr, int target){
        int start=0;
        int end =arr.length-1;

        boolean isAsec =arr[start]<arr[end];

        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsec){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid]){
                    end=mid+1;
                }
            }
        }
        return -1;
    }
}
