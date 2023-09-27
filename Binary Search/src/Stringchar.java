public class Stringchar{
    public static void main(String[] args) {
        String name ="abhi";
        char target = 'a';
        System.out.println(search(name,3));
    }

    static boolean search(String str, int target){
        for(int i=0;i<str.length();i++){

            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}