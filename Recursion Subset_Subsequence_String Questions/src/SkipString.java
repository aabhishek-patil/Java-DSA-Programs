public class SkipString {
    public static void main(String[] args) {
        System.out.println(skip("aaab"));
    }
    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch=str.charAt(0);
        if(ch =='a'){
            return skip(str.substring(1));
        }
        else{
            return ch+skip(str.substring(1));
        }
    }
}