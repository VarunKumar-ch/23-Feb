import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapChallenge {
    public static void main(String[] args) {
        HashMap<String,Integer> Hmp= new HashMap<String,Integer>(); //Declaring HashMap
        ArrayList<String> str = new ArrayList<String>();            //String of type List
        str.addAll(List.of(new String[]{"John", "Mary", "Bob"}));  //Adding elements to List
        for(String i:str){   //looping through StringList and adding value to particular key in HashMap
            if(i == "Mary"){
                Hmp.put(i,30);
            }else if(i == "John"){
                Hmp.put(i,25);
            }else if(i == "Bob"){
                Hmp.put(i,35);
            }
        }
        for(Map.Entry m:Hmp.entrySet()){ //runs through map size
            System.out.println(m.getKey() + " "+ m.getValue());
        }
    }
}
