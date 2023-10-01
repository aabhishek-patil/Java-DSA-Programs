public class DuplicateNo {
    public int [] Dup(int[]arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
        }
        return new int[]{-1};
    }

    static void swap(int[]arr, int first, int second){
        int temp=first;
        first=second;
        second=first;
    }
}
