import java.util.ArrayList;

public class DiagonalPath {
    public static void main(String[] args) {
        System.out.println(dpath("",3,3));
    }
    static ArrayList<String> dpath(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list= new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(dpath(p+'D',r-1,c-1)) ;
        }
        if(r>1){
            list.addAll((dpath(p+"V",r-1,c)));
        }
        if(c>1){
            list.addAll((dpath(p+"H",r,c-1)));
        }
        return list;
    }
}
