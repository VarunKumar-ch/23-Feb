import java.util.LinkedList;
import java.util.List;

public class LinkedListChallenge {
    public static void main(String[] args) {
        int elemnet =3;
        LinkedList<String> LL = new LinkedList<String>();
        LL.add("apple");
        LL.add("banana");
        LL.add("cherry");
        LL.add("date");
        LL.add("elderberry");
        System.out.println(LL);
        LL.remove(elemnet-1);
        System.out.println(LL);

    }
}
