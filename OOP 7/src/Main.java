import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//collections
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(8);
        System.out.println(list2);
    }
}