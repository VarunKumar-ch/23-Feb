import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetChallenge {
    public static void main(String[] args) {
        TreeSet<Integer> Tst = new TreeSet<Integer>();
        Tst.addAll(List.of(new Integer[]{5, 3, 8, 2, 6}));
        for(Integer x:Tst){
            System.out.println(x);
        }
    }
}
