import java.util.ArrayList;

interface Playable{
    void play();
    void stop();
}
class Guitar implements Playable{
    public void play(){
        System.out.println("I am playing Guitar");
    }
    public void stop(){
        System.out.println("Stop playing with Guitar");
    }
}

class  Drums implements Playable{
    public void play(){
        System.out.println("I am playing with Drums");
    }
    public void stop(){
        System.out.println("stop playing with Drums");
    }
}
class piano implements Playable{
    public void play(){
        System.out.println("playing piano");
    }
    public void stop(){
        System.out.println("stop playing with piano");
    }
}

public class InterFaceChallenge {
    public static void main(String[] args) {
        Playable guitar = new Guitar();
        Playable drum  = new Drums();
        Playable piano = new piano();
        ArrayList<Playable> e = new ArrayList<Playable>();
        e.add(drum);
        e.add(guitar);
        e.add(piano);
        for(Playable x:e){
            x.play();
            x.stop();
        }

        //e[0] = drum
        //e[1] = guitar
        //e[2] = piano
    }

}
