import java.util.ArrayList;

public class ArrayListChallenge {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        for(int i=1;i<=10;i++){
            n.add(i);
        }
        for(Integer x:n){
            System.out.println(x);
        }
    }
}
