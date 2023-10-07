public class PaasingNo {
    public static void main(String[] args) {
        int ans = pn(5);
        System.out.println(ans);
    }
    static int pn(int n){
        if(n==0){
            return 0;
        }
        System.out.println(n);
        return pn(--n);
    }
}
